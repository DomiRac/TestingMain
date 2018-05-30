package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;

    public OrderRequest(final Product product, final User user) {
        this.product = product;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
