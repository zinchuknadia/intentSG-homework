package com.intentsg.solidDI;

public class NotificationService {
    public void notify(String message, String type) {
        if (type.equals("email")) {
            System.out.println("Sending email: " + message);
        } else if (type.equals("sms")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
