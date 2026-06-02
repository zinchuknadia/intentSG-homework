package com.intentsg.patternFactory.exception;

public class IllegalDatabaseConnectorType extends RuntimeException {
    public IllegalDatabaseConnectorType(String message) {
        super(message);
    }
}
