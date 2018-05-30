package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public Client client;
    public Product product;
    public boolean sold;

    public OrderDto(final Client client, final Product product,final boolean bought) {
        this.product = product;
        this.sold = sold;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return sold;
    }

    public Client getUser() {
        return client;
    }
}