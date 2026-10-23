package com.objectorientedprogramming.Inheritance;

public class MainProduct {
    public static void main (String arsg[]) {
        ProductSuperClass product = new ProductSuperClass(45, "Isha", 4564325, 45);
        product.displayDetails();
        System.out.println("=============================================");
        ElectronicProduct electronic = new ElectronicProduct(52, "Jessi", 85697, 50, "HP", 5);
        electronic.getDetails();
        System.out.println("=============================================");
        LaptopProduct laptop = new LaptopProduct(63,"Rishi",152475,60,"Lenovo",6,8,550,"Windows 11");
        laptop.getProductDetails();
        System.out.println("Final Price of the Product : " + laptop.calculateUpgradeCost());
        System.out.println("=============================================");
    }
}
