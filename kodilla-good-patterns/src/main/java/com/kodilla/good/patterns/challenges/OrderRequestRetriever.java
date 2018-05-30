package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Product shoes = new Product("Shoes", 400);
        User adele = new User("Adele", "Jasna 8/50");

        return new OrderRequest(shoes, adele);

    }
}