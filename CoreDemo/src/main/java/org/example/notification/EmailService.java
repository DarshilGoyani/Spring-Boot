package org.example.notification;



public class EmailService implements Notification {
    @Override
    public void sendNotification(){
        System.out.println("Email Notification Sent");
    }
}
