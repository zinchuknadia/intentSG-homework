package com.intentsg.patternFactory.model;

public class PostgresConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL");
    }
}
