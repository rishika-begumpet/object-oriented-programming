package com.objectorientedprogramming.Inheritance;

public class LaptopProduct extends ElectronicProduct {
    int ramMemory;
    int storageSize;
    String operatingSystem;

    public LaptopProduct(int productId, String productName, double price, int discountPercentage, String brand, int warrantyYears, int ramMemory, int storageSize, String operatingSystem) {
        super(productId, productName, price, discountPercentage, brand, warrantyYears);
        this.ramMemory = ramMemory;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
    }

    public void getProductDetails() {
        getDetails();
        System.out.println("Ram Memory : " + ramMemory);
        System.out.println("Storage Size : " + storageSize);
        System.out.println("Operating System : " + operatingSystem);
    }

    double calculateUpgradeCost() {
        if (ramMemory <= 8) {
            return price + 4000;
        } else if (ramMemory == 8 && ramMemory <= 15) {
            return price + 2000;
        } else {
            return price;
        }
    }

}
