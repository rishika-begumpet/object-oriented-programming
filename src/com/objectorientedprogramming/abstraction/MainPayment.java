package com.objectorientedprogramming.abstraction;

public class MainPayment {
    public static void main(String args[]){

       Payment payment = new Payment(5252,"Isha",2000);
       UPI upi = new UPI(639,"Preethi",5000,1000,"12309745");
       Customer customer = new Customer(248,"Ram",5000,1000,"523698755",96,"Priya","ram@gmail.com",91526485);
//        CreditCard credit = new CreditCard(964,"Rishi",8000,45621,"Rishi");
//        DebitCard debit = new DebitCard(745,"Krish",9000,5298);
//        COD cash = new COD(410,"Divya",7000,500);
        PaymentServices service = new PaymentServices();
        PaymentServices services = new PaymentServices(upi);
        System.out.println("==========================================");
        services.display(payment);
        service.show(customer);
    }
}
