package com.objectorientedprogramming.polymorphism;

public class MainHospital {
    public static void main(String args[]) {
        Hospital hospital = new Hospital(45, "Isha", 50000);
        Doctor doctor = new Doctor(63, "Jessi", 75000, 500.0);
        Nurse nurse = new Nurse(86, "Madhu", 50000, 5, 5000);
        Receptionist receptionist = new Receptionist(74, "Preethi", 20000, 1000);
        HospitalServices hospitalServices = new HospitalServices();
        hospitalServices.displayHospital(hospital);
        hospitalServices.displayNurse(nurse);
        hospitalServices.displayDoctor(doctor);
        hospitalServices.displayReceptionist(receptionist);
    }

}
