package com.objectorientedprogramming.Inheritance;

public class Product {
    int id;
    String name;
    int price;
    int discountPercentage;
    float rating;
    int delieveryDate;
     String brand;
     String modelName;
     String  colour;
     int  ramMemory;
     int discountedAmount;
     int finalPrice;

        public Product(){
     }
    public Product(int id, String name, int price, int discountPercentage, float rating, int delieveryDate, String brand, String modelName, String colour, int ramMemory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.delieveryDate = delieveryDate;
        this.brand = brand;
        this.modelName = modelName;
        this.colour = colour;
        this.ramMemory = ramMemory;
    }

    public void displayProduct(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("DiscountPercentage : " + discountPercentage + "%");
        System.out.println("Rating : " + rating);
        System.out.println("DeieveryDate : " + delieveryDate);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + modelName);
        System.out.println("Color : " + colour);
        System.out.println("Ram Memory : " + ramMemory);
    }
      public  int getDiscountedAmount(){
            return   price*discountPercentage / 100;
        }
      public  int getFinalPrice(){
            return price - price*discountPercentage / 100 ;
        }
}
