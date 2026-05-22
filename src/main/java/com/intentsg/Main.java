package com.intentsg;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.model.Figure;
import com.intentsg.storage.FigureStorage;
import com.intentsg.supplier.FigureSupplier;
import com.intentsg.util.AnnotationScanner;

public class Main {
    private static final int FIGURE_STORAGE_SIZE = 10;

    public static void main(String[] args) {
        FigureStorage<Figure> storage = fillFigureStorage();
        drawFigures(storage);
        AnnotationScanner.scanDefaultAreas();
    }

    private static FigureStorage<Figure> fillFigureStorage() {
        FigureStorage<Figure> storage = new FigureStorage<>();
        FigureSupplier figureSupplier = new FigureSupplier();

        fillRandomFigures(storage, figureSupplier);
        fillDefaultFigures(storage, figureSupplier);
        return storage;
    }

    private static void fillRandomFigures(FigureStorage<Figure> storage, FigureSupplier supplier) {
        for (int i = 0; i < FIGURE_STORAGE_SIZE / 2; i++) {
            storage.add(supplier.getRandomFigure());
        }
    }

    private static void fillDefaultFigures(FigureStorage<Figure> storage, FigureSupplier supplier) {
        for (int i = FIGURE_STORAGE_SIZE / 2; i < FIGURE_STORAGE_SIZE; i++) {
            storage.add(supplier.getDefaultFigure());
        }
    }

    private static void drawFigures(FigureStorage<Figure> storage) {
        int[] idsToTry = {0, 5, 9, 10, 42, 99};
        for (int id : idsToTry) {
            try {
                storage.getById(id).draw();
            } catch (FigureNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
