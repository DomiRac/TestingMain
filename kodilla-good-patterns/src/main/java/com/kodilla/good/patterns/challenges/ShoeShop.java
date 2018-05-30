package com.kodilla.good.patterns.challenges;

public class ShoeShop implements OrderService {
    public boolean sell(final User user, final Product product) {

        System.out.println("Product: " + product.getName() + " is bought for " + user.getUserName() + " and it will be send to adress: " + user.getUserAdress() );

        return true;
    }
}
