package com.intentsg.model;

public abstract class Figure implements Drawable {
    protected final String shapeName;
    protected String color;

    public Figure(String color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }

    public abstract double getArea();
}
