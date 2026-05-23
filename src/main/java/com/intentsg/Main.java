package com.intentsg;

import com.intentsg.task.FigureStorageRunner;
import com.intentsg.task.FigureCollectionRunner;

public class Main {
    public static void main(String[] args) {
        new FigureStorageRunner().runAnnotationTask();
        new FigureCollectionRunner().runCollectionTask();
    }
}
