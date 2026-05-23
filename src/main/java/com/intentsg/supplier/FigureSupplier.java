package com.intentsg.supplier;

import com.intentsg.model.Figure;
import com.intentsg.model.FigureType;
import com.intentsg.model.Circle;
import com.intentsg.model.IsoscelesTrapezoid;
import com.intentsg.model.Square;
import com.intentsg.model.RightTriangle;
import com.intentsg.model.Rectangle;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 20;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_FIGURE_COLOR = "white";

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();

    public Figure getRandomFigure() {
        FigureType[] types = FigureType.values();
        FigureType type = types[rand.nextInt(types.length)];
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case CIRCLE -> new Circle(color, rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE);
            case ISOSCELES_TRAPEZOID -> generateTrapezoid(color);
            case RECTANGLE -> new Rectangle(
                    color,
                    getRandomValue(),
                    getRandomValue()
            );
            case RIGHT_TRIANGLE -> new RightTriangle(
                    color,
                    getRandomValue(),
                    getRandomValue()
            );
            case SQUARE -> new Square(
                    color,
                    getRandomValue()
            );
        };
    }

    private IsoscelesTrapezoid generateTrapezoid(String color) {
        while (true) {
            double firstBase = getRandomValue();
            double secondBase = getRandomValue();
            double side = getRandomValue();

            double halfDifference = Math.abs(firstBase - secondBase) / 2.0;

            if (side > halfDifference) {
                return new IsoscelesTrapezoid(color, firstBase, secondBase, side);
            }
        }
    }

    private int getRandomValue() {
        return rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
