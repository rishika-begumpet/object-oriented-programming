package com.objectorientedprogramming.abstraction;

public class UPI extends Payment {
    int discountAmount;
    String upiId;

    public UPI(int customerid, String name, int amount, int discountAmount, String upiId) {
        super(customerid, name, amount);
        this.discountAmount = discountAmount;
        this.upiId = upiId;
    }

    void pay(){
            super.pay();
            System.out.println("Discount Amount : " + discountAmount);
            System.out.println("UPI ID : " + upiId);
        }
}
