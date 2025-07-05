package com.feba.onlinestore;

public class StripPaymentService implements PaymentService {
    @Override
    public void ProcessPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount" + amount);
    }
}
