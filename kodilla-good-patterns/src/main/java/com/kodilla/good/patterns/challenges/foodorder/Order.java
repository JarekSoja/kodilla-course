package com.kodilla.good.patterns.challenges.foodorder;

public class Order implements OrderService {

    private OrderRequest orderRequest;
    private FoodSupplier foodSupplier;

    public Order(OrderRequest orderRequest, FoodSupplier foodSupplier) {
        this.orderRequest = orderRequest;
        this.foodSupplier = foodSupplier;
    }

    @Override
    public boolean orderCheck(Order order) {
        return (foodSupplier.getOfferedProducts().contains(orderRequest.getOrderedProducts()));
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }
}
