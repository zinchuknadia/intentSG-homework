package com.intentsg.task;

import com.intentsg.model.Circle;
import com.intentsg.model.Figure;
import com.intentsg.service.FigureStreamService;
import com.intentsg.supplier.FigureSupplier;

import java.util.ArrayList;
import java.util.List;

public class FigureStreamRunner {
    private static final int FIGURE_COUNT = 15;

    private final FigureSupplier figureSupplier = new FigureSupplier();
    private final FigureStreamService service = new FigureStreamService();

    public void runStreamTask() {
        List<Figure> figures = generateFigures();
        service.countLargeAndRedFigures(figures);
        service.printFigureDescriptions(figures);
        service.groupFiguresByType(figures);
        service.findFirstCircle(figures);
        findFirstCircleInNoCircleList(figures);
    }

    private void findFirstCircleInNoCircleList(List<Figure> figures) {
        figures.removeIf(figure -> figure instanceof Circle);
        service.printFigureDescriptions(figures);
    }

    private List<Figure> generateFigures() {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures.add(figureSupplier.getRandomFigure());
        }
        return figures;
    }
}
