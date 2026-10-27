package com.objectorientedprogramming.abstraction;

public class PushNotification  extends Notification{
    String deviceName;
    String appName;

    public PushNotification(String recipient, String message, String deviceName, String appName) {
        super(recipient, message);
        this.deviceName = deviceName;
        this.appName = appName;
    }

    public void send() {
        System.out.println("Name of the recipient : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Name of the Device : " +deviceName );
        System.out.println("Name of the App : " +appName);
    }
}
