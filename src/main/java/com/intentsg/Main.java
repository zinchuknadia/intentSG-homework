package com.intentsg;

import com.intentsg.figure.*;
import com.intentsg.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        int listSize = 10;
        Figure[] figures = new Figure[listSize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
