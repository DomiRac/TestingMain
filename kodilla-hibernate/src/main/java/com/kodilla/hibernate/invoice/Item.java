package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item(Product jacket, BigDecimal bigDecimal, int i, BigDecimal decimal) {
    }

    public Item(int id, Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    @NotNull
    public int getId() {
        return id;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public Product getProduct() {
        return product;
    }

    @Column(name = "PRICE")
    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    @NotNull
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    @NotNull
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
