package com.intentsg.figure;

import com.intentsg.annotation.DefaultArea;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color, "circle");
        this.radius = radius;
    }

    @Override
    @DefaultArea
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
