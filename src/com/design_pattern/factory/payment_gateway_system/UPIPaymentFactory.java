package com.design_pattern.factory.payment_gateway_system;

//CONCRETE FACTORY
public class UPIPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new UPIPayment();
    }
}
