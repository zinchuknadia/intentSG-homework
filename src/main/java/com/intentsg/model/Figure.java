package com.intentsg.model;

import java.util.Objects;

public abstract class Figure implements Drawable {
    protected final FigureType type;
    protected final String color;

    public Figure(String color, FigureType type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Figure figure = (Figure) o;
        return type == figure.type && color.equals(figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }
}
