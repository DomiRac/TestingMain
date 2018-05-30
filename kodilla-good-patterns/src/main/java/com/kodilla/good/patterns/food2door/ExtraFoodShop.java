package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements OrderService {

    @Override
    public boolean process(Product product, Client client) {
        System.out.println(client.getClientName() + " " + client.getClientSurname() + " bought: " + product.getNameOfProduct() + " in the quantity: "
                + product.getQuantityOfProduct() + " and it will be ship to: " + client.getClientAdress());
        return false;
    }
}
