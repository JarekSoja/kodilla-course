package com.kodilla.patterns2.decorator.pizza;

public class AnchoviesDecorator extends AbstractPizzaOrderDecorator {

    public AnchoviesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public long getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getToppings() {
        return super.getToppings() + "\n - anchovies";
    }
}
