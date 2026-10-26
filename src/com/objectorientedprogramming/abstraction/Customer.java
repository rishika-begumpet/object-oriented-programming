package com.objectorientedprogramming.abstraction;

public class Customer extends UPI {
    int id;
    String name;
    String email;
    int phoneNumber;

    public Customer(int customerid, String name, int amount, int discountAmount, String upiId, int id, String name1, String email, int phoneNumber) {
        super(customerid, name, amount, discountAmount, upiId);
        this.id = id;
        this.name = name1;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    void show (){
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Email : " + email);
            System.out.println("Phone Number : " + phoneNumber);
            System.out.println("========= Payment Details :- ========");
            super.pay();
        }
    }
