package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopRepository implements OrderRepository {
    @Override
    public boolean createOrder(Client client, Product product) {
        return false;
    }
}
