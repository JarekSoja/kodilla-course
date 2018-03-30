package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name = "ITEMS_PRODUCT")
    public Product getProduct() {
        return product;
    }
    @Column (name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column (name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column (name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name = "ITEMS_INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
