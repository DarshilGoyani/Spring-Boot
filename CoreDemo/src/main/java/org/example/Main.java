package org.example;

import org.example.notification.EmailService;
import org.example.notification.Notification;
import org.example.notification.PopupService;
import org.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Notification notification = new EmailService();
        OrderService orderService = new OrderService(notification);
        orderService.placeOrder();
    }
}
