package com.objectorientedprogramming.abstraction;

public class DebitCard extends Payment{
    int cardNumber;

    public DebitCard(int customerid, String name, int amount, int cardNumber) {
        super(customerid, name, amount);
        this.cardNumber = cardNumber;
    }
    void pay(){
        super.pay();
        System.out.println("Card number : " +cardNumber);

    }
}
