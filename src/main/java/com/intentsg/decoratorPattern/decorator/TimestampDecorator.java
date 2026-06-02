package com.intentsg.decoratorPattern.decorator;

import com.intentsg.decoratorPattern.model.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends LoggerDecorator {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public TimestampDecorator(Logger wrapped) {
        super(wrapped);
    }

    @Override
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        wrapped.log("[" + timestamp + "] " + message);
    }
}
