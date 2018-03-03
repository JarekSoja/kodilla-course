package com.kodilla.good.patterns.challenges.foodorder;

import java.util.List;

public class GlutenFreeShop extends FoodSupplier {

    public GlutenFreeShop(String supplierData, List<String> offeredProducts) {
        super(supplierData, offeredProducts);
    }

    @Override
    public void process() {
        System.out.println("Picking up order with weekly delivery from GlutenFreeShop.");
    }

    @Override
    public void payment() {

    }

    @Override
    public void delivery() {

    }
}
