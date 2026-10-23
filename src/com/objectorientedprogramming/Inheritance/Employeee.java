package com.objectorientedprogramming.Inheritance;

public class Employeee {
    int employeeId;
    String employeeName;
    double basicSalary;
    int tax;

    public  Employeee(){
    }
    public  Employeee(int employeeId,String employeeName,double basicSalary,int tax){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.tax = tax;
    }
     public  void getDisplayDetails(){
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + basicSalary);
        System.out.println("Tax : " + tax);
     }
      public double  calculateSalary(){
        return basicSalary - tax;
     }
}
