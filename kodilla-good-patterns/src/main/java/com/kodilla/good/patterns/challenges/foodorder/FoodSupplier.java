package com.kodilla.good.patterns.challenges.foodorder;

import java.util.ArrayList;
import java.util.List;


public abstract class FoodSupplier {

    String supplierData;
    List<String> offeredProducts;

    public FoodSupplier(String supplierData, List<String> offeredProducts) {
        this.supplierData = supplierData;
        this.offeredProducts = offeredProducts;
    }

    public String getSupplierData() {
        return supplierData;
    }

    public List<String> getOfferedProducts() {
        return offeredProducts;
    }

    public abstract void process();

    public abstract void payment();

    public abstract void delivery();

}
