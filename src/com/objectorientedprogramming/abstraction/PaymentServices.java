package com.objectorientedprogramming.abstraction;

public class PaymentServices {
    // Tightly Coupled layer
    Payment payment;
    public PaymentServices() {
        // this.payment = new Payment(745,"Isha",50000) ;
        // this.payment = new UPI(96,"Isha",506,85,5263454);
        this.payment = new DebitCard(745,"Isha",50000,5268);
        payment.pay();
        System.out.println("======================================");
  }
    public PaymentServices(Payment payment) {
        // Tightly Coupled layer
        // this.payment = new Payment(745,"Isha",50000) ;
        // this.payment = new UPI(96,"Isha",506,85,5263454);
        // this.payment = new DebitCard(745,"Isha",50000,5268) ;
        payment.pay();
    }
    public void  display(Payment payment){
        payment.pay();
        System.out.println("======================================");
    }
    public void show(Customer customer){
        customer.show();
    }
}
