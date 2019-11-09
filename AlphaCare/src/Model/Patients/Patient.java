/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patients;

/**
 *
 * @author david
 */
public class Patient {

    private String patientName;
    private String patientID;
    private String passWord;

    /**
     * This is the default constructor for Patient.
     *
     * @param patientName
     * @param patientID
     * @param passWord
     */
    public Patient(String patientName, String patientID, String passWord) {
        this.patientName = patientName;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

}