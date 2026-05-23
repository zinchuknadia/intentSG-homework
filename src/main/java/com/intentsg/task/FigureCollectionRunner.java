package com.intentsg.task;

import com.intentsg.model.Figure;
import com.intentsg.model.Square;
import com.intentsg.service.FigureCollectionService;
import com.intentsg.supplier.FigureSupplier;

import java.util.ArrayList;
import java.util.List;

public class FigureCollectionRunner {
    private static final int FIGURE_LIST_SIZE = 20;
    private static final String WHITE_COLOR = "white";
    private static final int SQUARE_SIDE = 10;

    private final FigureSupplier figureSupplier = new FigureSupplier();
    private final FigureCollectionService figureCollectionService = new FigureCollectionService();

    public void runCollectionTask() {
        List<Figure> figures = new ArrayList<>();

        for (int i = 0; i < FIGURE_LIST_SIZE; i++) {
            figures.add(figureSupplier.getRandomFigure());
        }

        System.out.println("=== Group figures by type ===");
        figureCollectionService.groupByType(figures);
        System.out.println("=== Unique figures by color ===");
        figureCollectionService.uniqueFiguresByColor(figures);
        System.out.println("Unique figures test: 2 identical figures");
        uniqueFiguresTestExample();
        System.out.println("=== Top-3 largest figures by area ===");
        figureCollectionService.printTopThreeLargestFigures(figures);
        System.out.println("=== Average area by color ===");
        figureCollectionService.printAverageAreaByColor(figures);
        System.out.println("=== Unmodifiable map ===");
        figureCollectionService.demonstrateUnmodifiableMapBehavior();
    }

    private void uniqueFiguresTestExample() {
        List<Figure> squares = new ArrayList<>();
        squares.add(new Square(WHITE_COLOR, SQUARE_SIDE));
        squares.add(new Square(WHITE_COLOR, SQUARE_SIDE));
        figureCollectionService.uniqueFiguresByColor(squares);
    }
}
