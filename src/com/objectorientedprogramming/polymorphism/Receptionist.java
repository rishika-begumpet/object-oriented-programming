package com.objectorientedprogramming.polymorphism;

public class Receptionist extends Hospital {
    double attendanceBonus;

    public Receptionist(int employeeId, String name, double monthlySalary, double attendanceBonus) {
        super(employeeId, name, monthlySalary);
        this.attendanceBonus = attendanceBonus;
    }
    double calculateMonthlyPay(){
        return  monthlySalary + attendanceBonus;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Attendance Bonus ; " + attendanceBonus);
        System.out.println("Total Income : " + calculateMonthlyPay());
    }
}
