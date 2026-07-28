package com.design_pattern.adapter.universal_payment_gateway;

public class Application {
    public static void main(String[] args) {
        PaymentGateway stripePaymentGateway = new StripePayment();
        Checkout stripeCheckout = new Checkout(stripePaymentGateway);
        stripeCheckout.makePayment(1000);

        PaymentGateway fastPaySDK = new FastPaySDKAdapter(new FastPaySDK());
//        PaymentGateway fastPaySDK = new FastPaySDKAdapter(null);
        Checkout fastPayCheckout = new Checkout(fastPaySDK);
        fastPayCheckout.makePayment(2000);
    }
}
