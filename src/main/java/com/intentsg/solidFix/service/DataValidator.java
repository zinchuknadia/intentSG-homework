package com.intentsg.solidFix.service;

import java.util.List;

public class DataValidator {
    public void validate(List<String> data) {
        if (data == null || data.isEmpty()) {
            throw new RuntimeException("Data is empty");
        }
    }
}
