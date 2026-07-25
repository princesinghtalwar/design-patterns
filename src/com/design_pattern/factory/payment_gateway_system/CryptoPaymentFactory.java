package com.design_pattern.factory.payment_gateway_system;

//CONCRETE FACTORY
public class CryptoPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CryptoPayment() ;
    }
}
