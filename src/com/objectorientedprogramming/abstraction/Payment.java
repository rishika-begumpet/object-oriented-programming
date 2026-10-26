package com.objectorientedprogramming.abstraction;

public class Payment {
    int id;
    String name;
    int amount;

    public Payment(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;

    }

    void pay() {
        System.out.println("Payment Id : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Amount : " + amount);
    }
}
