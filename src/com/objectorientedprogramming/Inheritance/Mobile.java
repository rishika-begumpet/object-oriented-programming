package com.objectorientedprogramming.Inheritance;

public class Mobile extends Product {
    int batteryCapacity;
    int simCardCount;
    long imeiNumber;
    boolean callCapability;

    public Mobile(int id, String name, int price, int discountPercentage, float rating, int delieveryDate, String brand, String modelName, String colour, int ramMemory, int batteryCapacity, int simCardCount, long imeiNumber, boolean callCapability) {
        super(id, name, price, discountPercentage, rating, delieveryDate, brand, modelName, colour, ramMemory);
        this.batteryCapacity = batteryCapacity;
        this.simCardCount = simCardCount;
        this.imeiNumber = imeiNumber;
        this.callCapability = callCapability;
    }

    public void displayMobile(){
        System.out.println("Battery Capacity : " + batteryCapacity);
        System.out.println("SimCard Count " + simCardCount );
        System.out.println("IMEI Number : " + imeiNumber );
        System.out.println("Call Capability : " + callCapability);
        System.out.println("=====================================================");
    }
}
