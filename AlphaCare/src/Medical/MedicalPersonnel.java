/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical;

import Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MedicalPersonnel {
    private ArrayList<Patient> patientList;
    private String passWord;
    private String personnelID;

    public MedicalPersonnel(String personnelID, String passWord, ArrayList<Patient> patientList) {
        this.passWord = passWord;
        this.personnelID = personnelID;
        this.patientList = patientList;
    }

    public ArrayList<Patient> getPatient() {
        return patientList;
    }

    public void setPatient(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
        /**
     *
     * @return
     */
    public String getPersonnelID() {
        return personnelID;
    }

    /**
     *
     * @param personnelID
     */
    public void setPersonnelID(String personnelID) {
        this.personnelID = personnelID;
    }

    /**
     *
     * @return
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public void addPatient(Patient patient){
        patientList.add(patient);
    }    
    
}
