package com.kodilla.patterns2.decorator.pizza;

public class ChorizoDecorator extends AbstractPizzaOrderDecorator {

    public ChorizoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public long getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getToppings() {
        return super.getToppings() + "\n - chorizo,";
    }
}
