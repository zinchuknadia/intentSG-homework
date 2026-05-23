package com.intentsg.supplier;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "blue", "green", "yellow", "black", "white"};
    private final Random rand = new Random();

    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }
}
