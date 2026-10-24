package com.objectorientedprogramming.polymorphism;

public class Nurse extends Hospital{
    int nightShifts;
    double nightShiftAllowance;

    public Nurse(int employeeId, String name, double monthlySalary, int nightShifts, double nightShiftAllowance) {
        super(employeeId, name, monthlySalary);
        this.nightShifts = nightShifts;
        this.nightShiftAllowance = nightShiftAllowance;
    }
    double calculateMonthlyPay(){
        return  monthlySalary + nightShiftAllowance;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Night Shifts : " + nightShifts);
        System.out.println("NightShift Allowance : " + nightShiftAllowance );
        System.out.println("Total Income : " + calculateMonthlyPay());
    }
    }
