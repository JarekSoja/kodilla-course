package com.kodilla.good.patterns.challenges;

public class ShippingDTO {

    private PostalService postalService;
    private Product product;
    private boolean isPaid;

    public ShippingDTO(PostalService postalService, Product product, boolean isPaid) {
        this.postalService = postalService;
        this.product = product;
        this.isPaid = isPaid;
    }
}
