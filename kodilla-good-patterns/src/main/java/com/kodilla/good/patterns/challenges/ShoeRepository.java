package com.kodilla.good.patterns.challenges;

public class ShoeRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product) {
        return false;
    }
}
