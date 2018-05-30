package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[]args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService orderService = new ProductOrderService(new MailService(), new GlutenFreeShop(), new GlutenFreeShopRepository());
        orderService.process(orderRequest);
    }
}
