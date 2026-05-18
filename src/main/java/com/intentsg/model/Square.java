package com.intentsg.model;

public class Square extends Figure{
    private double a;

    public Square(String color, double a) {
        super(color, "square");
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + shapeName +
                ", area: " + getArea() +
                " sq. units, a: " + a +
                " units, color: " + color);
    }
}
