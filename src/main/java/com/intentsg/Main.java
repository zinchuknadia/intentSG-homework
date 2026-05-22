package com.intentsg;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.model.Figure;
import com.intentsg.model.Circle;
import com.intentsg.model.Square;
import com.intentsg.model.IsoscelesTrapezoid;
import com.intentsg.model.RightTriangle;
import com.intentsg.model.Rectangle;
import com.intentsg.storage.FigureStorage;
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
            storage.add(figureSupplier.getRandomFigure());
        }
        for (int i = listSize / 2; i < listSize; i++) {
            storage.add(figureSupplier.getDefaultFigure());
        }

        int[] idsToTry = {0, 5, 9, 10, 42, 99};
        for (int id : idsToTry) {
            try {
                storage.getById(id).draw();
            } catch (FigureNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        AnnotationScanner.scanDefaultAreas(figureClasses);
    }
}
