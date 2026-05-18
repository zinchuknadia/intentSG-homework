package com.intentsg.util;

import com.intentsg.annotation.DefaultArea;

import java.lang.reflect.Method;

public class AnnotationScanner {
    public static void scanDefaultAreas(Class<?>[] classes) {
        for (Class<?> clazz : classes) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(DefaultArea.class)) {
                    System.out.println(clazz.getSimpleName() + ", " + method.getName() +
                            " is annotated with @DefaultArea");
                }
            }
        }
    }
}
