package com.objectorientedprogramming.polymorphism;


public  class Laptop extends Product {
    int hardDiskSize;
    String operatingSystem;
    String screenSize;
    boolean touchpadPresent;

    public Laptop(int id, String name, int price, int discountPercentage, float rating, String delieveryDate, String brand, String modelName, String colour, int ramMemory, int hardDiskSize, String operatingSystem, String screenSize, boolean touchpadPresent) {
        super(id, name, price, discountPercentage, rating, delieveryDate, brand, modelName, colour, ramMemory);
        this.hardDiskSize = hardDiskSize;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.touchpadPresent = touchpadPresent;
    }
         public  void displayProduct(){
          System.out.println("===================================================");
          super.displayProduct();
          System.out.println("HardDisk : " + hardDiskSize );
          System.out.println("Operating System : " + operatingSystem);
          System.out.println("Screen Size : " + screenSize);
          System.out.println("TouchPad Present : " + touchpadPresent);
          System.out.println("=====================================================");
        }
}
