package com.intentsg.solidDI;

import com.intentsg.solidDI.model.EmailNotification;
import com.intentsg.solidDI.model.PushNotification;
import com.intentsg.solidDI.model.SmsNotification;
import com.intentsg.solidDI.service.NotificationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotificationService> services = List.of(
                new NotificationService(new EmailNotification()),
                new NotificationService(new SmsNotification()),
                new NotificationService(new PushNotification())
        );

        for (NotificationService service : services) {
            service.notify("Your order has been placed.");
        }
    }
}
