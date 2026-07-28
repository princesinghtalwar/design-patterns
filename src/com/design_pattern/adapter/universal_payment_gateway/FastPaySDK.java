package com.design_pattern.adapter.universal_payment_gateway;

//ADAPTEE
public class FastPaySDK {

    public void sendPayment(double money) {
        System.out.println("FastPay processed ₹" + money);
    }

}
