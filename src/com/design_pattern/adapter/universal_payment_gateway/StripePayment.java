package com.design_pattern.adapter.universal_payment_gateway;

public class StripePayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Stripe");
    }
}
