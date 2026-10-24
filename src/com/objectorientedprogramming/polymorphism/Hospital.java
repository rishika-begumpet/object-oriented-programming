package com.objectorientedprogramming.polymorphism;

public class Hospital {
    int employeeId;
    String name;
    double monthlySalary;

    public Hospital(){
    }

    public Hospital(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    double calculateMonthlyPay(){
        return  monthlySalary;
    }
    void displayDetails(){
        calculateMonthlyPay();
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + name);
        System.out.println("Mmonthly Salary : " + monthlySalary);
        System.out.println("Total Income : " + calculateMonthlyPay());
    }

}
