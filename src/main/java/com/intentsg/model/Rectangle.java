package com.intentsg.model;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(String color, double a, double b) {
        super(color, "rectangle");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + shapeName +
                ", area: " + getArea() +
                " sq. units, a: " + a +
                " units, b: " + b +
                "units, color: " + color);
    }
}
