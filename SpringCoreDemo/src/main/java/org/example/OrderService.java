package org.example;

public class OrderService {
    PaymentService paymentService;

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){

        paymentService.pay();
        System.out.println("Order Placed");
    }

}
