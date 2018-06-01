package com.kodilla.patterns2.decorator.pizza;

public class JumboShrimpsDecorator extends AbstractPizzaOrderDecorator {

    public JumboShrimpsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public long getCost() {
        return super.getCost() +5;
    }

    @Override
    public String getToppings() {
        return super.getToppings() + "\n - jumbo shrimps,";
    }
}
