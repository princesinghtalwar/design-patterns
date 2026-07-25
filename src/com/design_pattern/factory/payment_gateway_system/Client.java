package com.design_pattern.factory.payment_gateway_system;

public class Client {
    private Payment payment = null;

    public Client(PaymentFactory paymentFactory){
        payment = paymentFactory.createPayment();
    }

    public Payment getPaymentInstance(){
        return this.payment;
    }
}
