package com.intentsg.model;

import com.intentsg.annotation.DefaultArea;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
