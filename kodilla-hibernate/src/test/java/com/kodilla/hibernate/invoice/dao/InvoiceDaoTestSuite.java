package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Product dress = new Product("Nice dress");
        Product somethingBlue = new Product("It's something blue");
        Product jacket = new Product("Jacket");

        Item item1 = new Item(jacket, new BigDecimal(100), 400, new BigDecimal(100 * 400));
        Item item2 = new Item( somethingBlue, new BigDecimal(200), 266, new BigDecimal(200 * 266));
        Item item3 = new Item(dress ,new BigDecimal(499), 100, new BigDecimal(499 * 100));

        item1.setProduct(jacket);
        item2.setProduct(somethingBlue);
        item3.setProduct(dress);

        Invoice invoice = new Invoice("AF12997/2018");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        Assert.assertNotEquals(0, invoiceId);

        try {

            invoiceDao.delete(invoiceId);
        } catch (Exception e) {

        }
    }
}
