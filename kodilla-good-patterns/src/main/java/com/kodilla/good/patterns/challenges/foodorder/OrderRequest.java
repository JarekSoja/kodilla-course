package com.kodilla.good.patterns.challenges.foodorder;

public class OrderRequest {

    private User user;
    private String orderedProducts;

    public OrderRequest(final User user, final String orderedProducts) {
        this.user = user;
        this.orderedProducts = orderedProducts;
    }

    public User getUser() {
        return user;
    }

    public String getOrderedProducts() {
        return orderedProducts;
    }
}
