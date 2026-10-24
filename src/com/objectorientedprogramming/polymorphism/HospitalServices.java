package com.objectorientedprogramming.polymorphism;

public class HospitalServices {

    // Method Overloading

    void displayHospital(Hospital hospital){
        hospital.displayDetails();
        System.out.println("===================================================");
    }
    void displayDoctor(Doctor doctor){
        doctor.displayDetails();
        System.out.println("===================================================");
    }
    void displayNurse(Nurse nurse) {
        nurse.displayDetails();
        System.out.println("===================================================");
    }
    void displayReceptionist( Receptionist receptionist){
        receptionist.displayDetails();
        System.out.println("===================================================");
    }
}
