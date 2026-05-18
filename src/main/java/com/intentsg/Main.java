package com.intentsg;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.figure.Figure;
import com.intentsg.figure.Circle;
import com.intentsg.figure.Square;
import com.intentsg.figure.IsoscelesTrapezoid;
import com.intentsg.figure.RightTriangle;
import com.intentsg.figure.Rectangle;
import com.intentsg.supplier.FigureSupplier;
import com.intentsg.util.AnnotationScanner;

public class Main {
    private final static Class<?>[] figureClasses = {
            Circle.class,
            IsoscelesTrapezoid.class,
            Rectangle.class,
            RightTriangle.class,
            Square.class
    };

    public static void main(String[] args) {
        int listSize = 10;
        FigureSupplier figureSupplier = new FigureSupplier();
        FigureStorage<Figure> storage = new FigureStorage<>();

        for (int i = 0; i < listSize / 2; i++) {
            storage.addFigure(figureSupplier.getRandomFigure());
        }
        for (int i = listSize / 2; i < listSize; i++) {
            storage.addFigure(figureSupplier.getDefaultFigure());
        }

        int idOverflow = 3;
        for (int i = 0; i < listSize + idOverflow; i++) {
            try {
                storage.getById(i).draw();
            } catch (FigureNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        AnnotationScanner.scanDefaultAreas(figureClasses);
    }
}
