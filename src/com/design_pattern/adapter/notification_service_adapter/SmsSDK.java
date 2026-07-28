package com.design_pattern.adapter.notification_service_adapter;

//ADAPTEE
public class SmsSDK {

    public void sendSMS(String phoneNumber, String text) {
        System.out.println(
                "SMS sent to " + phoneNumber + ": " + text
        );
    }

}
