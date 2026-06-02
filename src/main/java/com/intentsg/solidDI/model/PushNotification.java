package com.intentsg.solidDI.model;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push message: " + message);
    }
}
