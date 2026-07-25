package com.design_pattern.factory.payment_gateway_system;
//CONCRETE CREATOR
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
