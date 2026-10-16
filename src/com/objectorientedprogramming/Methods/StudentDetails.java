package com.objectorientedprogramming.Methods;

public class StudentDetails {
    //Instance variables
    String name ;
    int age;
    //Instance Method
    public void displayDetails() {
        System.out.println("Name of the Student is : " +  name );
        System.out.println("Age of the Student is : " + age );
    }
    public static void main(String[] args) {
     StudentDetails  student1 = new StudentDetails();
     StudentDetails student2 = new StudentDetails();
     student1.name="Ridha";
     student1.age=18;
     student2.name="Isha";
     student2.age=17;
     student1.displayDetails();
     student2.displayDetails();
    }
}
