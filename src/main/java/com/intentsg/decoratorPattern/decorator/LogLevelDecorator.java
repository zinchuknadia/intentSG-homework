package com.intentsg.decoratorPattern.decorator;

import com.intentsg.decoratorPattern.model.Logger;

public class LogLevelDecorator extends LoggerDecorator {
    private final String level;

    public LogLevelDecorator(Logger wrapped, String level) {
        super(wrapped);
        this.level = level.toUpperCase();
    }

    @Override
    public void log(String message) {
        wrapped.log("[" + level + "] " + message);
    }
}
