package com.intentsg.decoratorPattern;

import com.intentsg.decoratorPattern.decorator.ContextDecorator;
import com.intentsg.decoratorPattern.decorator.LogLevelDecorator;
import com.intentsg.decoratorPattern.decorator.TimestampDecorator;
import com.intentsg.decoratorPattern.model.ConsoleLogger;
import com.intentsg.decoratorPattern.model.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Plain ===");
        Logger plain = new ConsoleLogger();
        plain.log("Server started");

        System.out.println();

        System.out.println("=== Timestamp ===");
        Logger withTimestamp = new TimestampDecorator(new ConsoleLogger());
        withTimestamp.log("Listening on port 8080");

        System.out.println();

        System.out.println("=== LogLevel + Timestamp ===");
        Logger withLevel = new LogLevelDecorator(
                new TimestampDecorator(
                        new ConsoleLogger()
                ),
                "WARN"
        );
        withLevel.log("Memory usage above 80%");

        System.out.println();

        System.out.println("=== Context + LogLevel + Timestamp ===");
        Logger full = new ContextDecorator(
                new LogLevelDecorator(
                        new TimestampDecorator(
                                new ConsoleLogger()
                        ),
                        "ERROR"
                ),
                "AuthService"
        );
        full.log("Invalid token received");
    }
}
