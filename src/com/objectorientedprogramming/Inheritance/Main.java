package com.objectorientedprogramming.Inheritance;

public class Main {
    public static void main(String args[]) {
        Product product = new Product(455, "Lenovo", 45451, 25, 4, 23 - 10 - 2026, "Lenovo", "Windows 11", "Silver grey", 45);
        product.displayProduct();
        product.getDiscountedAmount();
        product.getFinalPrice();
        System.out.println("======================================================");
        Laptop laptop = new Laptop(101, "HP Pavilion", 65000, 10, 4.5f, 5,
                "HP", "Pavilion 15", "Silver", 16, 512,
                "Windows 11", "15.6 inches", true);
        laptop.displayProduct();
        laptop.displayLaptopDetails();
        laptop.getDiscountedAmount();
        laptop.getFinalPrice();

        Mobile mobile = new Mobile(
                101, "Samsung Galaxy S24", 75000, 10, 4.6f, 5,
                "Samsung", "Galaxy S24", "Black", 8, 4000, 2,
                123456789012345L, true);
        mobile.displayProduct();
        mobile.displayMobile();
        mobile.getDiscountedAmount();
        mobile.getFinalPrice();
    }
}
