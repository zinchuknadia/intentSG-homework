package com.intentsg.service;

import com.intentsg.model.Circle;
import com.intentsg.model.Figure;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FigureStreamService {
    private static final int LARGE_FIGURE_THRESHOLD = 50;
    private static final String RED_COLOR = "red";

    public void countLargeAndRedFigures(List<Figure> figures) {
        Predicate<Figure> isLarge = figure -> figure.getArea() > LARGE_FIGURE_THRESHOLD;
        Predicate<Figure> isRed = figure -> figure.getColor().equals(RED_COLOR);

        long largeCount = figures.stream()
                .filter(isLarge)
                .count();
        long largeAndRedCount = figures.stream()
                .filter(isLarge.and(isRed))
                .count();

        System.out.println("Large figure count: " + largeCount);
        System.out.println("Large and red figure count: " + largeAndRedCount);
    }

    public void printFigureDescriptions(List<Figure> figures) {
        List<String> figureDescriptions = figures.stream()
                .map(this::describeFigure)
                .toList();
        figureDescriptions.forEach(System.out::println);
    }

    public void groupFiguresByType(List<Figure> figures) {
        Map<String, Long> countByType = figures.stream()
                .collect(Collectors.groupingBy(figure -> figure.getClass().getSimpleName(),
                        Collectors.counting()));
        System.out.println(countByType);
    }

    public void findFirstCircle(List<Figure> figures) {
        String firstCircle = figures.stream()
                .filter(figure -> figure instanceof Circle)
                .findFirst()
                .map(this::describeFigure)
                .orElse("no circle in the list");
        System.out.println(firstCircle);
    }

    private String describeFigure(Figure figure) {
        return figure.getClass().getSimpleName() +
                "[" + figure.getColor() + "]" +
                " area=" + figure.getArea();
    }
}
