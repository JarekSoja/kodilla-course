package com.kodilla.good.patterns.challenges.foodorder;

public class OrderProcessor {

    private TestingData testingData;
    private Order order;

    public OrderProcessor(TestingData testingData) {
        this.testingData = testingData;
    }

    private void getOrderFromWebsite(){
        this.order = new Order(new HealthyShop("Healthiest vegetables", testingData.getDummyWarehouse()), "potato", 2.0);
    }

    public boolean validateOrder(){
        return (this.order.getFoodSupplier().getOfferedProducts().contains(this.order.getOrderedProducts()));
    }

}
