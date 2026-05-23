package com.intentsg.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
