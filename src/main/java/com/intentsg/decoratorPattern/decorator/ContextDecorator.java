package com.intentsg.decoratorPattern.decorator;

import com.intentsg.decoratorPattern.model.Logger;

public class ContextDecorator extends LoggerDecorator {
    private final String context;

    public ContextDecorator(Logger wrapped, String context) {
        super(wrapped);
        this.context = context;
    }

    @Override
    public void log(String message) {
        wrapped.log("[" + context + "] " + message);
    }
}
