package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        long pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(15, pizzaCost);
    }


    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String pizzaDescription = pizzaOrder.getToppings();
        //Then
        assertEquals("Pizza with: \n - tomato sauce, \n - cheese,", pizzaDescription);
    }

    @Test
    public void testBasicPizzaOrderWithExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        long pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(17, pizzaCost);
    }


    @Test
    public void testBasicPizzaOrderWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getToppings();
        //Then
        assertEquals("Pizza with: \n - tomato sauce, \n - cheese,\n - extra cheese,", pizzaDescription);
    }

    @Test
    public void testBasicPizzaOrderWithExtraCheeseShrimpsAndPineappleGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JumboShrimpsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        long pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(23, pizzaCost);
    }


    @Test
    public void testBasicPizzaOrderWithExtraCheeseShrimpsAndPineappleGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JumboShrimpsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getToppings();
        //Then
        assertEquals("Pizza with: \n - tomato sauce, \n - cheese,\n - extra cheese,\n - jumbo shrimps,\n - pineapple,", pizzaDescription);
    }
}
