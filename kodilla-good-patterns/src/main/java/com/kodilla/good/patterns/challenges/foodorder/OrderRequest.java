package com.kodilla.good.patterns.challenges.foodorder;

public class OrderRequest implements OrderRepository {

    private String orderedProducts;
    private String currency;
    private double totalPrice;

    public OrderRequest(final String orderedProducts, final String currency, final double totalPrice) {
        this.orderedProducts = orderedProducts;
        this.currency = currency;
        this.totalPrice = totalPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderedProducts() {
        return orderedProducts;
    }

    @Override
    public Order createOrder(OrderRequest orderRequest, FoodSupplier foodSupplier) {
        return new Order(orderRequest, foodSupplier);
    }

    @Override
    public User getUser() {
        return null;
    }
}
