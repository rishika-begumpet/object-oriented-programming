package com.objectorientedprogramming;
public class Car {
    int price ;
    String model;
    String brand;
    String color;
    public static void  Car(int price,String model,String brand , String color){
        Car car = new Car();
        car.price = price;
        car.model = model;
        car.brand = brand;
        car.color = color;
        System.out.println( "Car Price :" + car.price   + " " + "Car Model : " + car.model + " " + "Car Brand : " + car.brand + " " + "Car Color : " + car.color);
    }
    public static void main (String args[]){
        System.out.println("Car's Details  : ");
        Car(456,"2018","BMW","blue");
        Car(852,"2020","BMW","red");
        Car(963,"2026","BMW","white");
    }
}
