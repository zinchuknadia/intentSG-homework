package com.intentsg.service;

import com.intentsg.model.Figure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureCollectionService {
    public void groupByType(List<Figure> figures) {
        Map<String, List<Figure>> groupedFigures = new HashMap<>();
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
}
