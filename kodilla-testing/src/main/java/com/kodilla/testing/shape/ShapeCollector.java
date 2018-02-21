package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {

    private ArrayList<Shape> shapes= new ArrayList<>();

    public void addFigure(Shape shape){
        this.shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        this.shapes.remove(shape);
    }

    public Shape getFigure(int position){
        return this.shapes.get(position);
    }
    public void showFigures(){
        System.out.println(this.shapes);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;
        ShapeCollector collector = (ShapeCollector) o;
        return Objects.equals(getShapes(), collector.getShapes());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getShapes());
    }
}
