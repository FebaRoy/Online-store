package com.feba.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlineStoreApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(OnlineStoreApplication.class, args);
		var OrderService = context.getBean(OrderService.class);
		//USING SETTER
//		var OrderService=new OrderService();
//		OrderService.setPaymentService(new PaypalPaymentService());
		OrderService.placeOrder();
	}

}
