package com.intentsg;

import com.intentsg.exception.FigureNotFoundException;
import com.intentsg.figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureStorage<T extends Figure> {
    private final List<T> figures = new ArrayList<>();

    public void addFigure(T figure) {
        figures.add(figure);
    }

    public T getById(int id) {
        int minId = 0;
        if (id < minId || id >= figures.size()) {
            throw new FigureNotFoundException("Figure #" + id + " not found");
        }
        return figures.get(id);
    }

    public int size() {
        return figures.size();
    }
}
