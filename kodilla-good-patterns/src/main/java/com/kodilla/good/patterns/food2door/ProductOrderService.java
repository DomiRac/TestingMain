package com.kodilla.good.patterns.food2door;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,final OrderService orderService,final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isSold = orderService.process(orderRequest.getProduct(), orderRequest.getClient());
        if(isSold) {
            informationService.inform(orderRequest.getClient());
            orderRepository.createOrder(orderRequest.getClient(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getClient(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getClient(), orderRequest.getProduct(), false);

        }
    }
}
