package com.objectorientedprogramming;
public class EmployeeDetails{
    String name;
    int salary;
    int age;
    char gender;
    public void display( String name,int age, int salary,char gender){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
                System.out.println("Name of the employee : " + name + " " );
                System.out.println("Employee Salary : " + salary + " " );
                System.out.println("Employee Age : " + age + " ");
                System.out.println("Employee Gender : " + gender);
                System.out.println("-----------------------------------" +
                                    "----------------------------------");
    }
    public static void main(String args[]){
        EmployeeDetails employee = new EmployeeDetails();
        System.out.println("Employee Details ");
        employee.display("Isha",18,100000,'F');
        employee.display("Ridha",20,10000,'F');
        employee.display("Krishna",16,60000,'M');

    }
}
