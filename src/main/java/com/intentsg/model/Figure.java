package com.intentsg.model;

public abstract class Figure implements Drawable {
    protected final FigureType type;
    protected final String color;

    public Figure(String color, FigureType type) {
        this.color = color;
        this.type = type;
    }

    public abstract double getArea();

    protected abstract String getFigureParameters();

    @Override
    public void draw() {
        System.out.println("Figure: " + type.toString().toLowerCase() +
                ", area: " + getArea() +
                getFigureParameters() +
                ", color: " + color);
    }
}
