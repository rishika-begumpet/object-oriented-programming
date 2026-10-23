package com.objectorientedprogramming.Inheritance;

public class Developer extends Employeee {
    String programmingLanguage;
    int bonus ;

    public Developer(int employeeId, String employeeName, double basicSalary, int tax, String programmingLanguage, int bonus) {
        super(employeeId, employeeName, basicSalary, tax);
        this.programmingLanguage = programmingLanguage;
        this.bonus = bonus;
    }
    void displayDetails(){
        getDisplayDetails();
         System.out.println("Programming Language: " + programmingLanguage);
         System.out.println("Bonus : " + bonus);
    }
   public  double calculateIncome(){
        return  bonus + (basicSalary - tax);
    }
}

