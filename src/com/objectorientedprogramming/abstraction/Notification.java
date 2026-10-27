package com.objectorientedprogramming.abstraction;

public abstract class Notification {
    String recipient ;
    String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }
    public abstract void  send();

   public  void displayNotificationDetails(){
       System.out.println("**************Notification******************");
    }
}
