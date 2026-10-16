package com.objectorientedprogramming.Methods;
public class Name {
    void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Name name = new Name();
        name.printName("Isha");
        name.printName("Krish");
    }
}
