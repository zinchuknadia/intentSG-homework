package com.intentsg.solidDI;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notify("Hello!", "email");
        notificationService.notify("Hello!", "sms");
    }
}
