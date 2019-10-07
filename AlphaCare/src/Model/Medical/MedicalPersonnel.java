/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medical;

import Model.Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MedicalPersonnel {
    private ArrayList<Patient> patientList;
    private String passWord;
    private String personnelID;

    /**
     * constructor for MedicalPersonnel
     * @param personnelID
     * @param passWord
     */
    public MedicalPersonnel(String personnelID, String passWord) {
        this.passWord = passWord;
        this.personnelID = personnelID;
        this.patientList = new ArrayList<>();
    }

    /**
     *
     * @return an ArrayList of Patient objects 
     */
    public ArrayList<Patient> getPatient() {
        return patientList;
    }

    /**
     * sets the ArrayList of Patient objects for the medical personnel's class instance
     * @param patientList
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
        /**
     *
     * @return a string object that stands for the medical personnel's id
     */
    public String getPersonnelID() {
        return personnelID;
    }

    /**
     * sets the medical personnel's id for the class instance
     * @param personnelID
     */
    public void setPersonnelID(String personnelID) {
        this.personnelID = personnelID;
    }

    /**
     *
     * @return a string object that stands for the medical personnel's password
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * sets the password for the medical personnel's class instance
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    /**
     * adds a patient to the medical personnel's class instance ArrayList of Patient objects
     * @param patient
     */
    public void addPatient(Patient patient){
        patientList.add(patient);
    }    
    
}
