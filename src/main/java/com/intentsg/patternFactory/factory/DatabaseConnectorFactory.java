package com.intentsg.patternFactory.factory;

import com.intentsg.patternFactory.exception.IllegalDatabaseConnectorType;
import com.intentsg.patternFactory.model.DatabaseConnector;
import com.intentsg.patternFactory.model.MongoConnector;
import com.intentsg.patternFactory.model.MySQLConnector;
import com.intentsg.patternFactory.model.PostgresConnector;

public class DatabaseConnectorFactory {
    public static DatabaseConnector create(String type) {
        return switch (type.toLowerCase()) {
            case "postgres" -> new PostgresConnector();
            case "mysql" -> new MySQLConnector();
            case "mongo" -> new MongoConnector();
            default -> throw new IllegalDatabaseConnectorType("Unknown database type: " + type);
        };
    }
}
