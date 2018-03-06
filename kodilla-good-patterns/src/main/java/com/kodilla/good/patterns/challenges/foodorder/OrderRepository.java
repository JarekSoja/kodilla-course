package com.kodilla.good.patterns.challenges.foodorder;

public interface OrderRepository {

    Order createOrder(OrderRequest orderRequest, FoodSupplier foodSupplier);

    User getUser();


}
