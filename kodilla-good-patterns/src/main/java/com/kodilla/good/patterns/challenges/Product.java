package com.kodilla.good.patterns.challenges;

public interface Product {

    boolean isAvailable(int ordered);

    double getPrice();

    double getShippingCost(int ordered);

}
