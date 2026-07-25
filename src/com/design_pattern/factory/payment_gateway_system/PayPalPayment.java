package com.design_pattern.factory.payment_gateway_system;

//CONCRETE PRODUCT
public class PayPalPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("PayPal payment done");
    }
}
