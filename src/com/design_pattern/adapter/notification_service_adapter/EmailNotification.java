package com.design_pattern.adapter.notification_service_adapter;

public class EmailNotification implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
