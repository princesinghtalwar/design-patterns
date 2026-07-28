package com.design_pattern.adapter.universal_payment_gateway;

//CLIENT CODE
public class Checkout {
    private final PaymentGateway gateway;

    public Checkout(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void makePayment(double amount) {
        gateway.pay(amount);
    }
}
