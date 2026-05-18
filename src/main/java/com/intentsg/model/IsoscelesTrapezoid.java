package com.intentsg.model;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double side;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double side) {
        super(color, "isosceles trapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        double h = Math.sqrt(Math.pow(side, 2) - Math.pow((firstBase - secondBase) / 2, 2));
        return ((firstBase + secondBase) / 2) * h;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + shapeName +
                ", area: " + getArea() +
                " sq. units, firstBase: " + firstBase +
                " units, secondBase: " + secondBase +
                " units, side: " + side +
                " units, color: " + color);
    }
}
