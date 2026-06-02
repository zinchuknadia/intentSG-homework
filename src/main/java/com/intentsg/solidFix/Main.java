package com.intentsg.solidFix;

import com.intentsg.solidFix.service.DataValidator;
import com.intentsg.solidFix.service.EmailSender;
import com.intentsg.solidFix.service.FileSaver;
import com.intentsg.solidFix.service.reportGenerator.CsvReportGenerator;
import com.intentsg.solidFix.service.reportGenerator.PdfReportGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("Row 1", "Row 2", "Row 3");

        DataValidator validator = new DataValidator();
        FileSaver fileSaver = new FileSaver();
        EmailSender emailSender = new EmailSender();

        System.out.println("=== PDF report ===");
        ReportManager pdfManager = new ReportManager(new PdfReportGenerator(), validator, fileSaver, emailSender);
        pdfManager.processReport(data);

        System.out.println();

        System.out.println("=== CSV report ===");
        ReportManager csvManager = new ReportManager(new CsvReportGenerator(), validator, fileSaver, emailSender);
        csvManager.processReport(data);
    }
}
