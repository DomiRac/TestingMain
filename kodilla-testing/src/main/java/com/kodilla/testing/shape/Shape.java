package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;


interface Shape {
    String getShapeName();
    double getField();
}

class ShapeCollector {
    private List <Shape> shapes = new ArrayList<>();

    public List <Shape> getShapes() {
        return shapes;
    }



    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public boolean removeFigure (Shape shape) {

        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n>0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public void showFigures() {
        if(!shapes.isEmpty()) {
            System.out.println("Contained figures:");
            for(Shape shape: shapes) {
                System.out.println("Figure: " + shape.getShapeName() + "has field; " + shape.getField());
            }
        } else {
            System.out.println("There is nothing :(");
        }
    }
    public int howManyFigures(){
        return shapes.size();
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Triangle implements Shape {
    private double high;
    private double sideLength;

    public Triangle(double high, double sideLength) {
        this.high = high;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {

        return "triangle";
    }

    @Override
    public double getField() {
        return high * sideLength * 0.5;
    }
}

class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;

    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return Math.pow(sideLength, 2);
    }
}