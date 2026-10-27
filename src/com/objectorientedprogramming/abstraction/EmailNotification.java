package com.objectorientedprogramming.abstraction;

public class EmailNotification extends Notification{
String email;

    public EmailNotification(String recipient, String message, String email) {
        super(recipient, message);
        this.email = email;
    }
void display(){
      System.out.println("******EMAIL******");
}
    public void send() {
        display();
        System.out.println("Name of the recipient : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Email : " + email);
    }
}

