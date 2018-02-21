package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements  Shape{

    private String name;
    private double baseLength;
    private double heightLength;

    public Triangle (String name, double baseLength, double heightLength){
        this.name = name;
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }
    public String getShapeName(){
        return this.name;
    }
    public double getField(){
        return (baseLength * heightLength) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.baseLength, baseLength) == 0 &&
                Double.compare(triangle.heightLength, heightLength) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, baseLength, heightLength);
    }
}
