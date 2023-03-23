/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yulon
 */
public class Doctor {
    String name;
    int doctorID;
    Hospital hospital;

    public String getName() {
        return name;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
}
