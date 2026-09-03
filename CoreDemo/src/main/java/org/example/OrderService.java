package org.example;

import org.example.notification.EmailService;
import org.example.notification.Notification;
import org.example.notification.PopupService;
import org.example.notification.SmsService;

public class OrderService {

    Notification notification;
    public OrderService(Notification notification){
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}
