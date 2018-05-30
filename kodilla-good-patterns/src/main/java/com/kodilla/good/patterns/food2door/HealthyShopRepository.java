package com.kodilla.good.patterns.food2door;

public class HealthyShopRepository implements OrderRepository {
    @Override
    public boolean createOrder(Client client, Product product) {
        return false;
    }
}
