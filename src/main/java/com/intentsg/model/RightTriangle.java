package com.intentsg.model;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color, FigureType.RIGHT_TRIANGLE);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    protected String getFigureParameters() {
        return ", firstLeg: " + firstLeg +
                " units, secondLeg: " + secondLeg + " units";
    }
}
