package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Product product;
    private Client client;

    public OrderRequest(final Product product,final Client client) {
        this.product = product;
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public Client getClient() {
        return client;
    }
}