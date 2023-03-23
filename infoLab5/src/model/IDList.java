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
public class IDList {
    ArrayList<Integer> patientIDs;
    ArrayList<Integer> doctorIDs;
    
    
    private static volatile IDList instance = null;
    
    private IDList(){
        patientIDs = new ArrayList<Integer>();
        doctorIDs = new ArrayList<Integer>();
    }
    
    public static IDList getInstance(){
        if(instance == null){
            synchronized(IDList.class){
                if(instance == null){
                    instance = new IDList();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Integer> getPatientIDs(){
        return this.patientIDs;
    }
    
    public ArrayList<Integer> getDoctorIDs(){
        return this.doctorIDs;
    }
    
    public void addPatientID(int id){
        this.patientIDs.add(id);
    }
    
    public void addDoctorID(int id){
        this.doctorIDs.add(id);
    }
}
