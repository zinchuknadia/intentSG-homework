package com.intentsg.task;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.model.Figure;
import com.intentsg.storage.FigureStorage;
import com.intentsg.supplier.FigureSupplier;
import com.intentsg.util.AnnotationScanner;

public class FigureStorageRunner {
    private static final int FIGURE_STORAGE_SIZE = 10;
    private final FigureSupplier figureSupplier = new FigureSupplier();

    public void runAnnotationTask() {
        FigureStorage<Figure> storage = new FigureStorage<>();
        fillFigureStorage(storage);
        drawFigures(storage);
        AnnotationScanner.scanDefaultAreas();
    }

    private void fillFigureStorage(FigureStorage<Figure> storage) {
        fillRandomFigures(storage);
        fillDefaultFigures(storage);
    }

    private void fillRandomFigures(FigureStorage<Figure> storage) {
        for (int i = 0; i < FIGURE_STORAGE_SIZE / 2; i++) {
            storage.add(figureSupplier.getRandomFigure());
        }
    }

    private void fillDefaultFigures(FigureStorage<Figure> storage) {
        for (int i = FIGURE_STORAGE_SIZE / 2; i < FIGURE_STORAGE_SIZE; i++) {
            storage.add(figureSupplier.getDefaultFigure());
        }
    }

    private void drawFigures(FigureStorage<Figure> storage) {
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
