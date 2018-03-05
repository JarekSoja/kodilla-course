package com.kodilla.good.patterns.challenges.foodorder;

import java.util.List;

public class HealthyShop extends FoodSupplier {

    public HealthyShop(String supplierData, List<String> offeredProducts) {
        super(supplierData, offeredProducts);
    }

    @Override
    public void process() {
        System.out.println("Sending e-mail to HealthyShop with order details");
    }

    @Override
    public void payment() {
        System.out.println("Testing payment method for HealthyShop.");
    }

    @Override
    public void delivery() {
        System.out.println("Testing delivery method for HealthyShop.");

    }
}

