package com.intentsg.model;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    protected String getFigureParameters() {
        return ", side: " + side + " units";
    }
}
