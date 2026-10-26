package com.objectorientedprogramming.abstraction;

public class COD extends Payment{
    int delieveryCharges;

    public COD(int id, String name, int amount, int delieveryCharges) {
        super(id, name, amount);
        this.delieveryCharges = delieveryCharges;
    }
}
