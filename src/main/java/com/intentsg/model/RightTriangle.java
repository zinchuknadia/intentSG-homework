package com.intentsg.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        RightTriangle that = (RightTriangle) o;
        return Double.compare(firstLeg, that.firstLeg) == 0 && Double.compare(secondLeg, that.secondLeg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstLeg, secondLeg);
    }
}
