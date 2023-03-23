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
public class DoctorDirectory {
    ArrayList<Doctor> doctors;
    
    private static volatile DoctorDirectory instance = null;
    
    private DoctorDirectory(){}
    
    public static DoctorDirectory getInstance(){
        if(instance == null){
            synchronized(DoctorDirectory.class){
                if(instance == null){
                    instance = new DoctorDirectory();
                }
            }
        }
        return instance;
    }
}
