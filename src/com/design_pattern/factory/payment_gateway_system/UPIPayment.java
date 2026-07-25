package com.design_pattern.factory.payment_gateway_system;

//CONCRETE PRODUCT
public class UPIPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("UPI payment done");
    }
}
