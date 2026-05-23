package com.intentsg.model;

public enum FigureType {
    CIRCLE(Circle.class),
    RECTANGLE(Rectangle.class),
    RIGHT_TRIANGLE(RightTriangle.class),
    SQUARE(Square.class),
    ISOSCELES_TRAPEZOID(IsoscelesTrapezoid.class);

    private final Class<? extends Figure> figureClass;

    FigureType(Class<? extends Figure> figureClass) {
        this.figureClass = figureClass;
    }

    public Class<? extends Figure> getFigureClass() {
        return figureClass;
    }
}
