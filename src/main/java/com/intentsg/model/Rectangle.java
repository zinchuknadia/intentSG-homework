package com.intentsg.model;

import java.util.Objects;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color, FigureType.RECTANGLE);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    protected String getFigureParameters() {
        return ", width: " + width +
                " units, height: " + height + " units";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
