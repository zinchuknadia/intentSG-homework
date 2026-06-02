package com.intentsg.patternFactory;

import com.intentsg.patternFactory.exception.IllegalDatabaseConnectorType;
import com.intentsg.patternFactory.model.DatabaseConnector;
import com.intentsg.patternFactory.factory.DatabaseConnectorFactory;

public class Main {
    private static final String UNKNOWN_DB_TYPE = "oracle";

    public static void main(String[] args) {
        String[] types = {"postgres", "mysql", "mongo"};

        for (String type : types) {
            DatabaseConnector connector = DatabaseConnectorFactory.create(type);
            connector.connect();
            connector.disconnect();
            System.out.println();
        }

        try {
            DatabaseConnectorFactory.create(UNKNOWN_DB_TYPE);
        } catch (IllegalDatabaseConnectorType e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
