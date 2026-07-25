package com.design_pattern.factory.payment_gateway_system;

//CONCRETE PRODUCT
public class CreditCardPayment implements Payment{
    @Override
    public void makePayment() {
        System.out.println("credit card payment done");
    }
}
