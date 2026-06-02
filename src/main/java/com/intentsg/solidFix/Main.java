package com.intentsg.solidFix;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("data1", "data2", "data3");
        ReportManager pdfManager = new ReportManager("PDF");
        pdfManager.generateReport(data);
        pdfManager.saveToFile("data1.pdf");
        pdfManager.sendByEmail("data1@gmail.com");
        pdfManager.validateData(data);
    }
}
