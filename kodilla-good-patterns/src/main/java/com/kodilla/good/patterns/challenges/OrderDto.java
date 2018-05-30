package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public Product product;
    public boolean sold;

    public OrderDto(final User user, final Product product,final boolean bought) {
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

    public User getUser() {
        return user;
    }
}
