package com.objectorientedprogramming.abstraction;

public class MainNotification {
    public static void main(String args[]){
        SMSNotification sms = new SMSNotification("Jessi","Hello Jessi , How are you?","rishi",916121654);
        EmailNotification email = new EmailNotification("Isha","Hello Isha","isha@gmial.com");
        PushNotification push = new PushNotification("Preethi","Hello Preethi ", "Android","Myntra");
        Notification notification = new PushNotification("Krish","Hello Krish ","IPhone","Meesho");
        notification.displayNotificationDetails();
        NotificationServices notify = new NotificationServices();
        notify.send(email);
    }
}
