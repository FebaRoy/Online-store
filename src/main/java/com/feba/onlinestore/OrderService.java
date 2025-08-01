package com.feba.onlinestore;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

     //USING SETTER
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.ProcessPayment(30);
    }
}
