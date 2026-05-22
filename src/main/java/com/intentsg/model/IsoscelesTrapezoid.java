package com.intentsg.model;

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
}
