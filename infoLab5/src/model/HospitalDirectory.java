/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yulon
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitals;
    DoctorDirectory doctorDirectory;
    
    private static volatile HospitalDirectory instance = null;
    
    private HospitalDirectory(){
        hospitals = new ArrayList<Hospital>();
        doctorDirectory = DoctorDirectory.getInstance();
    }
    
    public static HospitalDirectory getInstance(){
        if(instance == null){
            synchronized(HospitalDirectory.class){
                if(instance == null){
                    instance = new HospitalDirectory();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Hospital> getHospitalsByCity(String city){
        ArrayList<Hospital> hos = new ArrayList<Hospital>();
        for(Hospital h : hospitals){
            if(h.city == city) this.hospitals.add(h);
        }
        return hos;
    }
    
    public ArrayList<Hospital> getHospitalsByCommunity(String community){
        ArrayList<Hospital> hos = new ArrayList<Hospital>();
        for(Hospital h : hospitals){
            if(h.comm.name == community) this.hospitals.add(h);
        }
        return hos;
    }
    
    public ArrayList<Hospital> getHospitals(){
        return this.hospitals;
    }
}
