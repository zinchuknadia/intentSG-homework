package com.intentsg;

import com.intentsg.task.FigureStorageRunner;
import com.intentsg.task.FigureCollectionRunner;
import com.intentsg.task.FigureStreamRunner;

public class Main {
    public static void main(String[] args) {
        new FigureStorageRunner().runAnnotationTask();
        new FigureCollectionRunner().runCollectionTask();
        new FigureStreamRunner().runStreamTask();
    }
}
