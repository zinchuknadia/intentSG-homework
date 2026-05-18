package com.intentsg;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.figure.*;
import com.intentsg.supplier.FigureSupplier;

public class Main {
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
    }
}
