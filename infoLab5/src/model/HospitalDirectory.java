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
    String city;
    ArrayList<Hospital> hospital;
    DoctorDirectory doctorDirectory;
    
    private static volatile HospitalDirectory instance = null;
    
    private HospitalDirectory(){}
    
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
}
