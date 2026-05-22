package com.intentsg.model;

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
}
