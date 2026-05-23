package com.intentsg.util;

import com.intentsg.annotation.DefaultArea;
import com.intentsg.model.Figure;
import com.intentsg.model.FigureType;

import java.lang.reflect.Method;

public final class AnnotationScanner {
    private static final String GET_AREA_METHOD_NAME = "getArea";
    private static final String DEFAULT_MARK = "[DEFAULT]";
    private static final String NORMAL_MARK = "[normal]";

    private AnnotationScanner() {
    }

    public static void scanDefaultAreas() {
        for (FigureType type : FigureType.values()) {
            Class<? extends Figure> clazz = type.getFigureClass();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().equals(GET_AREA_METHOD_NAME)) {
                    String mark = method.isAnnotationPresent(DefaultArea.class) ? DEFAULT_MARK : NORMAL_MARK;
                    System.out.println(mark + " " + clazz.getSimpleName() + "." + method.getName() + "()");
                }
            }
        }
    }
}
