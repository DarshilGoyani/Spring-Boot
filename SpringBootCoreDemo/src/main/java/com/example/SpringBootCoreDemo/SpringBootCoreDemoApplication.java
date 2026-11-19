package com.example.SpringBootCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);


		OrderService orderService = Context.getBean(OrderService.class);
		orderService.placeOrder();
	}
}
