package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String name;
    private double radius;
    private final double PI = 3.14159;

    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }
    public String getShapeName(){
        return this.name;
    }
    public double getField(){
        return (PI * (this.radius * this.radius));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.PI, PI) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, radius, PI);
    }
}
