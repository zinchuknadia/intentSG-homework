package com.intentsg.model;

import java.util.Objects;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double side;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double side) {
        super(color, FigureType.ISOSCELES_TRAPEZOID);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        double h = Math.sqrt((side * side) - Math.pow((firstBase - secondBase) / 2, 2));
        return ((firstBase + secondBase) / 2) * h;
    }

    @Override
    protected String getFigureParameters() {
        return ", firstBase: " + firstBase +
                " units, secondBase: " + secondBase +
                " units, side: " + side + " units";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        IsoscelesTrapezoid that = (IsoscelesTrapezoid) o;
        return Double.compare(firstBase, that.firstBase) == 0 && Double.compare(secondBase, that.secondBase) == 0 && Double.compare(side, that.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstBase, secondBase, side);
    }
}
