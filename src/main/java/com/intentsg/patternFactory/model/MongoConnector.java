package com.intentsg.patternFactory.model;

public class MongoConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB");
    }
}
