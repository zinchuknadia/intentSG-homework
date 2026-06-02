package com.intentsg.solidFix.service.reportGenerator;

import java.util.List;

public class CsvReportGenerator implements ReportGenerator {
    @Override
    public void generate(List<String> data) {
        System.out.println("Generating CSV...");
        for (String line : data) {
            System.out.println(line + ",");
        }
    }
}
