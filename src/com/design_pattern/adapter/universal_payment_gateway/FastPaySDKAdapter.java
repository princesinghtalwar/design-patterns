package com.design_pattern.adapter.universal_payment_gateway;

import java.util.Objects;

//ADAPTER
public class FastPaySDKAdapter implements PaymentGateway {
    private final FastPaySDK fastPaySDK;
    private static final String NULL_POINTER_EXCEPTION = "FastpaySDK must not be null";
    public FastPaySDKAdapter(FastPaySDK fastPaySDK){
//        this.fastPaySDK = fastPaySDK;
        this.fastPaySDK = Objects.requireNonNull(fastPaySDK,NULL_POINTER_EXCEPTION);
    }

    @Override
    public void pay(double amount) {
        fastPaySDK.sendPayment(amount);
    }
}
