package com.design_pattern.adapter.notification_service_adapter;

public class Application {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotification();
        NotificationManager emailNotificationManager = new NotificationManager(emailNotificationService);
        emailNotificationManager.notifyUser("Order confirmed");

        SmsSDK smsSDK = new SmsSDK();
        NotificationService smsNotificationService = new SmsSDKAdapter(smsSDK,"9808544");
        NotificationManager smsNotificationManager = new NotificationManager(smsNotificationService);
        smsNotificationManager.notifyUser("Order confirmed");
    }
}
