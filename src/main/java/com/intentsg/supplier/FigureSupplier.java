package com.intentsg.supplier;

import com.intentsg.figure.*;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();

    public Figure getRandomFigure() {
        int figuresNumber = 5;
        int type = rand.nextInt(figuresNumber);
        String color = colorSupplier.getRandomColor();

        int minValue = 1;
        int maxValue = 20;
        return switch (type) {
            case 0 -> new Circle(color, rand.nextInt(maxValue) + minValue);
            case 1 -> new IsoscelesTrapezoid(
                    color,
                    rand.nextInt(maxValue) + minValue,
                    rand.nextInt(maxValue) + minValue,
                    rand.nextInt(maxValue) + minValue
            );
            case 2 -> new Rectangle(
                    color,
                    rand.nextInt(maxValue) + minValue,
                    rand.nextInt(maxValue) + minValue
            );
            case 3 -> new RightTriangle(
                    color,
                    rand.nextInt(maxValue) + minValue,
                    rand.nextInt(maxValue) + minValue
            );
            case 4 -> new Square(
                    color,
                    rand.nextInt(maxValue) + minValue
            );
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        return new Circle("white", radius);
    }
}
