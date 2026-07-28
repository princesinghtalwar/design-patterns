package com.design_pattern.adapter.notification_service_adapter;

import java.util.Objects;

//ADAPTER
public class SmsSDKAdapter implements NotificationService{

    private final SmsSDK smsSDK;
    private final String mobileNo;
    private static final String NULL_POINTER_EXCEPTION = "SmsSDK must not be null";
    public SmsSDKAdapter(SmsSDK smsSDK, String mobileNo){
        this.smsSDK = Objects.requireNonNull(smsSDK,NULL_POINTER_EXCEPTION);
        this.mobileNo = mobileNo;
        if (mobileNo == null || mobileNo.isBlank()) {
            throw new IllegalArgumentException(
                    "Mobile number must not be blank"
            );
        }
    }

    @Override
    public void send(String message) {
        smsSDK.sendSMS(mobileNo,message);
    }
}
