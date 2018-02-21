package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private String name;
    private double sideLength;

    public Square (String name, double sideLength){
        this.name = name;
        this.sideLength = sideLength;
    }
    public String getShapeName(){
        return this.name;
    }
    public double getField(){
        return (this.sideLength * this.sideLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLength, sideLength) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sideLength);
    }
}
