package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Product nonGlutenBread = new Product("bestBreast...Bread", 5);
        Client liz666 = new Client("Lizie", "Strawinsky", "Moliera 6/7");

        return new OrderRequest(nonGlutenBread, liz666);
    }
}
