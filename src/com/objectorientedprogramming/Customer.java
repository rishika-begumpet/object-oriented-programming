package com.objectorientedprogramming;

import java.util.Scanner;

public class Customer {
    int id;
    String address;
    String name;
    long phone;
    char gender;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        for (int i = 1; i < 10; i++) {
            System.out.print("Enter ID: ");
            customer.id = sc.nextInt();
            System.out.print("Enter Address: ");
            customer.address = sc.next();
            System.out.print("Enter Name: ");
            customer.name = sc.next();
            System.out.print("Enter Phone Number: ");
            customer.phone = sc.nextLong();
            System.out.print("Enter Gender: ");
            customer.gender = sc.next().charAt(0);
            System.out.println("Id : " + customer.id);
            System.out.println("Name: " + customer.name);
            System.out.println("Address : " + customer.address);
            System.out.println("PhoneNo: " + customer.phone);
            System.out.println("Gender: " + customer.gender);
        }
    }
}
