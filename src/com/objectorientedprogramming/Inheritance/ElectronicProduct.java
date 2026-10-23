package com.objectorientedprogramming.Inheritance;

public class ElectronicProduct extends ProductSuperClass {
    String brand ;
    int warrantyYears;
    public ElectronicProduct(){

    }
    public ElectronicProduct(int productId, String productName, double price, int discountPercentage, String brand, int warrantyYears) {
        super(productId, productName, price, discountPercentage);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }
    public void getDetails(){
        displayDetails();
        System.out.println("Brand : "+ brand);
        System.out.println("Warranty Years : " + warrantyYears);
    }
}
