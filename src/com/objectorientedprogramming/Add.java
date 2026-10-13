package com.objectorientedprogramming;
public class  Add {
    int a ;
    int b ;
    int sum = 0 ;
    public void adding(int a , int b, int sum ){
        this.a = a;
        this.b = b;
        this.sum =  a + b;
        System.out.println(this.sum);
    }
    public static void main(String args[]){
        Add add = new Add();
        add.adding(5,6,0);
    }
}
