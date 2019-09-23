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
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public File getMedicalRecords() {
        return MedicalRecords;
    }

    /**
     *
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
