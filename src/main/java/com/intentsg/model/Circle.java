package com.intentsg.model;

import com.intentsg.annotation.DefaultArea;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    @Override
    @DefaultArea
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected String getFigureParameters() {
        return ", radius: " + radius + " units";
    }
}
