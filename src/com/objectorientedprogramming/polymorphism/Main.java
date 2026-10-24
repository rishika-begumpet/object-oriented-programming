package com.objectorientedprogramming.polymorphism;
public class Main {
    public static void main(String args[]){
        Product product = new Product(455,"Lenovo",45451,25,4,"23-10-2026","Lenovo","Windows 11","Silver grey",45);
        Laptop laptop = new Laptop( 101, "HP Pavilion", 65000, 10, 4.5f, "5-10-2026",
                "HP", "Pavilion 15", "Silver", 16, 512,
                "Windows 11", "15.6 inches", true);
        Mobile mobile = new Mobile(
                102, "Samsung Galaxy S24", 75000, 10, 4.6f, "23-10-2026",
                "Samsung", "Galaxy S24", "Black", 8, 4000, 2,
                123456789012345L, true);

        ProductServices productServices = new ProductServices();
        productServices.displayProduct(product);
        productServices.displayProduct(mobile);
        productServices.displayProduct(laptop);


    }
}
