package com.objectorientedprogramming.abstraction;

public class SMSNotification extends Notification {
    String senderName;
    int mobileNo;

    public SMSNotification(String recipient, String message, String senderName,int mobileNo) {
        super(recipient, message);
        this.senderName = senderName;
        this.mobileNo = mobileNo;
    }
     public void send(){
         System.out.println("Name of the recipient : " + recipient);
         System.out.println("Message : " + message);
         System.out.println("Name of the Sender : "+ senderName );
         System.out.println("Mobile Number : " + mobileNo);
//         System.out.println("");
//         System.out.println("");
//         System.out.println("");
     }

}
