package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {

    public BasicPizzaOrder() {
    }

    @Override
    public long getCost() {
        return 15;
    }

    @Override
    public String getToppings() {
        return "Pizza with: \n - tomato sauce, \n - cheese,";
    }
}
