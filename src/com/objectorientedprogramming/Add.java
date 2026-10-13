package com.objectorientedprogramming;
import java.util.Scanner;
public class  Add {
    Scanner sc = new Scanner (System.in);
    int a ;
    int b ;
    int sum = 0 ;
    public static void Add(int a , int b, int sum ){
        Add add = new Add();
        add.a = a;
        add.b = b;
        sum =  a + b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Add(1,2,0);
    }
}
