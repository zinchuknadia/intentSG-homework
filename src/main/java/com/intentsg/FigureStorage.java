package com.intentsg;

import com.intentsg.figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureStorage<T extends Figure> {
    private final List<T> figures = new ArrayList<>();

    public void addFigure(T figure) {
        figures.add(figure);
    }

    public T getById(int id) {
        return figures.get(id);
    }

    public int size() {
        return figures.size();
    }
}
