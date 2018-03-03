package com.kodilla.good.patterns.challenges.foodorder;

import java.util.ArrayList;
import java.util.List;

public class TestingData {

    private String dummyOrder;
    private List<String> dummyWarehouse = new ArrayList<>();

    public String getDummyOrder(){
        return this.dummyOrder;
    }

    public List<String> getDummyWarehouse(){
        return this.dummyWarehouse;
    }

    public void fillWithDummyData(){
        this.dummyOrder = "potato";
        this.dummyWarehouse.add("Tomato");
        this.dummyWarehouse.add("Potato");
    }
}
