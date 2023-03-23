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
public class PatientDirectory {
    ArrayList<Patient> patients;
    
    private static volatile PatientDirectory instance = null;
    
    private PatientDirectory(){}
    
    public static PatientDirectory getInstance(){
        if(instance == null){
            synchronized(PatientDirectory.class){
                if(instance == null){
                    instance = new PatientDirectory();
                }
            }
        }
        return instance;
    }
}
