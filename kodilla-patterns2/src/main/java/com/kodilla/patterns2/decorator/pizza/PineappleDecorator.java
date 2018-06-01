package com.kodilla.patterns2.decorator.pizza;

public class PineappleDecorator extends AbstractPizzaOrderDecorator {

    public PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public long getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getToppings() {
        return super.getToppings() + "\n - pineapple,";
    }
}
