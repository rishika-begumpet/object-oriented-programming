package com.objectorientedprogramming.Methods;
public class Customer {
    public void CustomerDetails(String name, int id, String address, long phone, char gender) {
        System.out.println( "Name : " + name + " ID : " +  id + " Address : "  + address + " PH.No : " +   phone + " Gender : " +  gender);
        System.out.println( "----------------------------------------------------------------------------------------");
    }
    public static void main(String args[]) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        customer1.CustomerDetails("Rishi", 64, "Hyderabad", 8451254545L, 'M');
        customer2.CustomerDetails("Isha", 85, "KPHB", 45841121L, 'F');
        customer3.CustomerDetails("Bhavya", 96, "Miyapur", 454857221L, 'F');
    }
}
