package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private final Product ORDERED_PRODUCT;
    private final PaymentMethod PAYMENT_METHOD;
    private final PostalService POSTAL_SERVICE;
    private ShippingDTO dataToShippingOperator;

    public ProductOrderProcessor(Product ORDERED_PRODUCT, PaymentMethod PAYMENT_METHOD, PostalService POSTAL_SERVICE) {
        this.ORDERED_PRODUCT = ORDERED_PRODUCT;
        this.PAYMENT_METHOD = PAYMENT_METHOD;
        this.POSTAL_SERVICE = POSTAL_SERVICE;
    }

    public ShippingDTO getDataToShippingOperator() {
        return dataToShippingOperator;
    }

    public void processOrder(){

    }
}
