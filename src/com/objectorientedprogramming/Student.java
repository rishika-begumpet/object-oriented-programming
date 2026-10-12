package com.objectorientedprogramming;
import java.util.Scanner;
public class Student {
    //instance variables
    String  name ;
    int age ;
    int marks;
    //method declaration
    public static void student(String name , int age, int marks){
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.marks = marks;
        System.out.println( "Name: " + st.name + " " + "Age: " + st.age + " " + "Marks: " + st.marks + " " );
    }
    //method invocation
    public static void main(String[] args) {
        System.out.println("Students Details are : ");
   student("isha",18,99);
   student("divya",18,89);
   student("Sree",18,78);
    }
}
