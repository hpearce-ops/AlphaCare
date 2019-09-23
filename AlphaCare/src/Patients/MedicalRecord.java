/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patients;

import java.io.File;

/**
 *
 * @author henrypearce
 */
public class MedicalRecord {

    private String patientID;
    private String name;
    private File MedicalRecords;

    /**
     * Default constructor for medical record. 
     * @param patientID
     * @param name
     * @param MedicalRecords
     */
    public MedicalRecord(String patientID, String name, File MedicalRecords) {
        this.patientID = patientID;
        this.name = name;
        this.MedicalRecords = MedicalRecords;
    }

    /**
     *
     * @return a string object representing a patient's id
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * sets the patient's id for the class instance of MedicalRecord
     * @param patientID
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     *
     * @return string object representing the patient's name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the patient's name for the class instance of MedicalRecord
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return a file object that represents a patient's medical records
     */
    public File getMedicalRecords() {
        return MedicalRecords;
    }

    /**
     * sets the file object for a patient for the MedicalRecords class instance 
     * @param MedicalRecords
     */
    public void setMedicalRecords(File MedicalRecords) {
        this.MedicalRecords = MedicalRecords;
    }

    /**
     * Uploads the user's medical record to their account. 
     * @param file
     */
    public void uploadMedicalRecord(File file) {
        setMedicalRecords(file);
    }

    /**
     * Removes user's medical record from view and deletes from storage. 
     */
    public void deleteMedicalRecord() {
        File blankFile = null;
        setMedicalRecords(blankFile);
        //other code to acutally delete file from storage. 
    }

}
