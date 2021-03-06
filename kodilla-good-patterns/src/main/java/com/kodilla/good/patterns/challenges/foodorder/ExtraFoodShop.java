package com.kodilla.good.patterns.challenges.foodorder;

import java.util.List;

public class ExtraFoodShop extends FoodSupplier {

    public ExtraFoodShop(String supplierData, List<String> offeredProducts) {
        super(supplierData, offeredProducts);
    }

    @Override
    public void process() {
        System.out.println("Making possible for ExtraFoodShop ordering system to download data with new order.");
    }

    @Override
    public void payment() {
        System.out.println("Testing payment method for ExtraFoodShop.");
    }

    @Override
    public void delivery() {
        System.out.println("Testing delivery method for ExtraFoodShop.");

    }
}
