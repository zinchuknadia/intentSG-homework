package com.intentsg.decoratorPattern.decorator;

import com.intentsg.decoratorPattern.model.Logger;

abstract class LoggerDecorator implements Logger {
    protected final Logger wrapped;

    public LoggerDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }
}
