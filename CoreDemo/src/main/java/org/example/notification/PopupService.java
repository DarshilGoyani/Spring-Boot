package org.example.notification;



public class PopupService implements Notification {
    @Override
    public void sendNotification(){
        System.out.println("Popup Notification sent");
    }
}
