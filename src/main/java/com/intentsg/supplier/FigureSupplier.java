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
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(
                    color,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE
            );
            case RECTANGLE -> new Rectangle(
                    color,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE
            );
            case RIGHT_TRIANGLE -> new RightTriangle(
                    color,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE
            );
            case SQUARE -> new Square(
                    color,
                    rand.nextInt(MAX_RANDOM_VALUE) + MIN_RANDOM_VALUE
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
