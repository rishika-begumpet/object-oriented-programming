package com.objectorientedprogramming.Inheritance;

public class ProductSuperClass {
    int productId;
    String productName;
    double price;
    int discountPercentage;
    public ProductSuperClass(){

    }
    public ProductSuperClass(int productId, String productName, double price, int discountPercentage) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    public double calculateDiscount(){
        return price*discountPercentage / 100;
    }
    public double getFinalPrice(){
        return price - price*discountPercentage / 100;
    }
    public void displayDetails(){
        System.out.println("ID : "+ productId);
        System.out.println("Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage + "%");
        System.out.println("Discount Amount : " + calculateDiscount());
        System.out.println("Final Price : " + getFinalPrice());
    }
}
