package com.objectorientedprogramming.abstraction;

public class CreditCard  extends Payment{
    int creditCardNumber;
    String creditCardHolder;

    public CreditCard(int id, String name, int amount, int creditCardNumber, String creditCardHolder) {
        super(id, name, amount);
        this.creditCardNumber = creditCardNumber;
        this.creditCardHolder = creditCardHolder;
    }
    void pay(){
        super.pay();
        System.out.println("Credit Number : " + creditCardNumber);
        System.out.println("Card Holder Name : " + creditCardHolder );
    }
}
