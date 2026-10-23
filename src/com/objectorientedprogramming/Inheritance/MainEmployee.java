package com.objectorientedprogramming.Inheritance;

public class MainEmployee {
    public static void main (String args[]){
        Employeee employee = new Employeee(45,"Isha",898676,450);
        System.out.println("=======================================");
        employee.getDisplayDetails();
        System.out.println( "Employee  final salary: "  + employee.calculateSalary());
        System.out.println("=======================================");
        Developer developer = new Developer(63,"Jessi",456345,650,"Python",5000);
        developer.displayDetails();
        System.out.println( "Developer Total Income : " +  developer.calculateIncome());
    }
}
