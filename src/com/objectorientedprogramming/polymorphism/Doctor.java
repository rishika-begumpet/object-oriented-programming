package com.objectorientedprogramming.polymorphism;

public class Doctor extends Hospital{
    double consultationBonus;

    public Doctor(int employeeId, String name, double monthlySalary, double consultationBonus) {
        super(employeeId, name, monthlySalary);
        this.consultationBonus = consultationBonus;
    }
    double calculateMonthlyPay(){
        return  monthlySalary + consultationBonus;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Consultation Bonus : " + consultationBonus);
        System.out.println("Total Income : " + calculateMonthlyPay());
    }
}
