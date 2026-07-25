package com.design_pattern.factory.payment_gateway_system;

/*
Scenario
---------
An e-commerce application supports multiple payment methods:
1. Credit Card
2. UPI
3. PayPal
4. Crypto

Each payment type has:
1. Different validation logic
2. Different transaction processing behavior
3. Same common interface
*/

public class Driver {
    public static void main(String[] args) {
        //CREDIT CARD
        PaymentFactory paymentFactory = new CreditCardPaymentFactory();
        Client creditCardClient = new Client(paymentFactory);
        var creditCardPaymentInstance = creditCardClient.getPaymentInstance();
        creditCardPaymentInstance.makePayment();

        //UPI
        PaymentFactory upiPaymentFactory = new UPIPaymentFactory();
        Client upiClient = new Client(upiPaymentFactory);
        var upiPaymentInstance = upiClient.getPaymentInstance();
        upiPaymentInstance.makePayment();

        //PayPal
        PaymentFactory payPalFactory = new PayPalPaymentFactory();
        Client payPalClient = new Client(paymentFactory);
        Payment upiPayment = payPalClient.getPaymentInstance();
        upiPayment.makePayment();

        //Crypto
        PaymentFactory cryptoPaymentFactory = new CryptoPaymentFactory();
        Client cryptoClient = new Client(cryptoPaymentFactory);
        var cryptoPaymentInstance = cryptoClient.getPaymentInstance();
        cryptoPaymentInstance.makePayment();
    }
}
