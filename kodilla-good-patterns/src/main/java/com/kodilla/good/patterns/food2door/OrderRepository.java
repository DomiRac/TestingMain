package com.kodilla.good.patterns.food2door;

public interface OrderRepository {

    public boolean createOrder(Client client, Product product);
}
