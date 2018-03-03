package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class HDD implements Product {

    private double capacity;
    private String producer;
    private String technology;
    private double price;
    private int warehouse;
    private double shippingCostPerUnit;

    public HDD(double capacity, String producer, String technology, double price, int warehouse, double shippingCost) {
        this.capacity = capacity;
        this.producer = producer;
        this.technology = technology;
        this.price = price;
        this.warehouse = warehouse;
        this.shippingCostPerUnit = shippingCost;
    }

    @Override
    public boolean isAvailable(int ordered) {
        if(ordered <= this.warehouse) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getShippingCost(int ordered) {
        return this.shippingCostPerUnit * ordered;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getProducer() {
        return producer;
    }

    public String getTechnology() {
        return technology;
    }

}
