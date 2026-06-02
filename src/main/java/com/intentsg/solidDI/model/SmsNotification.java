package com.intentsg.solidDI.model;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
