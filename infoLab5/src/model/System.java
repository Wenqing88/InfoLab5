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
public class System {
    DoctorDirectory doctorDirs;
    PatientDirectory patientDirs;
    PeopleDirectory peopleDirs;
    HospitalDirectory hospitalDirs;
    ArrayList<Community> communities;
    String cities[];
    
    private static volatile System instance = null;
    
    private System(){}
    
    public static System getInstance(){
        if(instance == null){
            synchronized(System.class){
                if(instance == null){
                    instance = new System();
                }
            }
        }
        return instance;
    }
}
