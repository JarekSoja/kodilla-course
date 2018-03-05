package com.kodilla.good.patterns.challenges.foodorder;

public interface OrderRepository {

    Order createOrder(User user, OrderRequest orderRequest);
}
