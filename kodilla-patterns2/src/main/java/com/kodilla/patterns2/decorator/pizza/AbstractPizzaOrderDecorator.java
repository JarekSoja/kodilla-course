package com.kodilla.patterns2.decorator.pizza;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public long getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getToppings() {
        return pizzaOrder.getToppings();
    }
}
