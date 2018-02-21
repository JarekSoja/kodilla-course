package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String name;
    private BigDecimal populace;

    public Country(String name, BigDecimal populace) {
        this.name = name;
        this.populace = populace;
    }

    public BigDecimal getPeopleQuantity(){
       return this.populace;
    }
}
