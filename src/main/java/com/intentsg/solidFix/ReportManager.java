package com.intentsg.solidFix;

import com.intentsg.solidFix.service.DataValidator;
import com.intentsg.solidFix.service.EmailSender;
import com.intentsg.solidFix.service.FileSaver;
import com.intentsg.solidFix.service.reportGenerator.ReportGenerator;

import java.util.List;

class ReportManager {
    private final ReportGenerator generator;
    private final DataValidator validator;
    private final FileSaver fileSaver;
    private final EmailSender emailSender;

    private static final String FILE = "report.txt";

    public ReportManager(ReportGenerator generator, DataValidator validator, FileSaver fileSaver, EmailSender emailSender) {
        this.generator = generator;
        this.validator = validator;
        this.fileSaver = fileSaver;
        this.emailSender = emailSender;
    }

    public void processReport(List<String> data) {
        validator.validate(data);
        generator.generate(data);
        fileSaver.save(FILE);
        emailSender.send(FILE);
    }
}