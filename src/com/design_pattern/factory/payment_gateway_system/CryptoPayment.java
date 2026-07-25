package com.design_pattern.factory.payment_gateway_system;

//CONCRETE PRODUCT
public class CryptoPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Crypto payment done");
    }
}
