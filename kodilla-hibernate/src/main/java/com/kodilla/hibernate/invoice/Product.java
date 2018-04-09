package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;
    private List<Item> items;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column (name = "NAME")
    public String getName() {
        return name;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @Column (name = "ITEMS_PRODUCT")
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}