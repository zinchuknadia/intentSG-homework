package com.intentsg.service;

import com.intentsg.model.Figure;

import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

public class FigureCollectionService {
    private static final int TOP_FIGURES_COUNT = 3;
    private static final String NEW_FIGURE_NAME = "Hexagon";

    private final Map<String, List<Figure>> groupedFigures = new HashMap<>();

    public void groupByType(List<Figure> figures) {
        for (Figure figure : figures) {
            String figureName = figure.getClass().getSimpleName();
            groupedFigures.computeIfAbsent(figureName, k -> new ArrayList<>()).add(figure);
        }

        for (Map.Entry<String, List<Figure>> entry : groupedFigures.entrySet()) {
            String figureName = entry.getKey();
            List<Figure> figureList = entry.getValue();

            double totalArea = 0;
            for (Figure figure : figureList) {
                totalArea += figure.getArea();
            }

            System.out.println(figureName +
                    ": count = " + figureList.size() +
                    ", total area = " + totalArea);
        }
    }

    public void uniqueFiguresByColor(List<Figure> figures) {
        Map<String, Set<Figure>> uniqueFigures = new HashMap<>();
        for (Figure figure : figures) {
            String color = figure.getColor();
            uniqueFigures.computeIfAbsent(color, k -> new HashSet<>()).add(figure);
        }

        for (Map.Entry<String, Set<Figure>> entry : uniqueFigures.entrySet()) {
            Set<Figure> figureSet = entry.getValue();
            System.out.println(figureSet.size());
        }
    }

    public void printTopThreeLargestFigures(List<Figure> figures) {
        List<Figure> sortedFigures = new ArrayList<>(figures);
        sortedFigures.sort(Comparator.comparing(Figure::getArea).reversed());

        int limit = Math.min(TOP_FIGURES_COUNT, sortedFigures.size());

        for (int i = 0; i < limit; i++) {
            Figure figure = sortedFigures.get(i);
            System.out.println(
                    figure.getClass().getSimpleName() +
                            " [" + figure.getColor() + "] " +
                            "area=" + figure.getArea()
            );
        }
        // У цьому випадку немає значення чи використовувати list.sort() чи Collections.sort(list).
        // Єдине що Collections.sort(list) вимагає додаткового імпорту java.util.Collections,
        // а list.sort() є сучаснішим підходом до використання логіки сортування колекцій
    }

    public void printAverageAreaByColor(List<Figure> figures) {
        Map<String, Double> areaSums = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        for (Figure figure : figures) {
            String color = figure.getColor();
            areaSums.merge(color, figure.getArea(), Double::sum);
            counts.merge(color, 1, Integer::sum);
        }

        for (String color : areaSums.keySet()) {
            double average = areaSums.get(color) / counts.get(color);
            System.out.println(color + " : " + average);
        }
    }

    public void demonstrateUnmodifiableMapBehavior() {
        Map<String, List<Figure>> wrapper = Collections.unmodifiableMap(groupedFigures);
        try {
            //Падає виняток UnsupportedOperationException, бо ми намагаємося змінити незмінюваний об'єкт
            wrapper.put(NEW_FIGURE_NAME, new ArrayList<>());
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable map");
        }

        System.out.println("Original size: " + groupedFigures.size());
        groupedFigures.put(NEW_FIGURE_NAME, new ArrayList<>());
        System.out.println("After modifying original");
        System.out.println("Original size: " + groupedFigures.size());
        System.out.println("Wrapper size: " + Collections.unmodifiableMap(groupedFigures).size());
    }
}
