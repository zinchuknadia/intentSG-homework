package com.intentsg.solidDI.service;

import com.intentsg.solidDI.model.Notification;

public class NotificationService {
    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notify(String message) {
        notification.send(message);
    }
}
