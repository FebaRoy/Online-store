package com.feba.onlinestore;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    public void ProcessPayment(double amount){
        System.out.println("PAYPAL");
        System.out.println("Amount" + amount);
    }
}
