package com.kodilla.good.patterns.challenges.foodorder;

import java.util.Map;

public class Order {

    private FoodSupplier foodSupplier;
    private String orderedProducts;
    private double totalPrice;

    public Order(FoodSupplier foodSupplier, String orderedProducts, double totalPrice) {
        this.foodSupplier = foodSupplier;
        this.orderedProducts = orderedProducts;
        this.totalPrice = totalPrice;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public String getOrderedProducts() {
        return orderedProducts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
