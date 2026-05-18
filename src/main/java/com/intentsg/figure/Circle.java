package com.intentsg.figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color, "circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + shapeName +
                ", area: " + getArea() +
                " sq. units, radius: " + radius +
                " units, color: " + color);
    }
}
