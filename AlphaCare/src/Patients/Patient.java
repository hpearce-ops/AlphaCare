/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patients;

/**
 *
 * @author david
 */
public class Patient {
    private String patientID;
    private String passWord;

    /**
     *
     * @param patientID
     * @param passWord
     */
    public Patient(String patientID, String passWord) {
        this.patientID = patientID;
        this.passWord = passWord;
    }

    /**
     *
     * @return
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     *
     * @param patientID
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
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
    
    
}
