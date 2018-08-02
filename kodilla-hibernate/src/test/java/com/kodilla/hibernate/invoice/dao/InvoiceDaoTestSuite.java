package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    public void testInvoiceDaoSave() {

        Product dress = new Product("Nice dress");
        Product somethingBlue = new Product("It's something blue");
        Product jacket = new Product("Jacket");

        Item item1 = new Item(jacket, new BigDecimal(100), 400, new BigDecimal(100 * 400));
        Item item2 = new Item(somethingBlue, new BigDecimal(200), 266, new BigDecimal(200 * 266));
        Item item3 = new Item(dress, new BigDecimal(499), 100, new BigDecimal(499 * 100));
        Item item4 = new Item(dress, new BigDecimal(399), 200, new BigDecimal(399 * 200));


        Invoice invoice1 = new Invoice("AF12997/2018");

        dress.getItems().add(item3);
        dress.getItems().add(item4);
        somethingBlue.getItems().add(item2);
        jacket.getItems().add(item1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        invoiceDao.save(item1);
        int item1Id = item1.getId();
        invoiceDao.save(item2);
        int item2Id = item2.getId();
        invoiceDao.save(item3);
        int item3Id = item3.getId();
        invoiceDao.save(item4);
        int item4Id = item4.getId();

        Assert.assertNotEquals(0, item1Id);
        Assert.assertNotEquals(0, item2Id);
        Assert.assertNotEquals(0, item3Id);
        Assert.assertNotEquals(0, item4Id);

        try {

            invoiceDao.delete(item1Id);
            invoiceDao.delete(item2Id);
            invoiceDao.delete(item3Id);
            invoiceDao.delete(item4Id);
        } catch (Exception e) {

        }
    }
}
