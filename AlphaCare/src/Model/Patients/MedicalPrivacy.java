/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patients;

/**
 *
 * @author henrypearce
 */
public class MedicalPrivacy {
    private Boolean medicalPersonnel[];  

    /**
     * Default constructor for MedicalPrivacy. 
     * @param medicalPersonnel
     */
    public MedicalPrivacy(Boolean[] medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    }

    /**
     *
     * @return
     */
    public Boolean[] getMedicalPersonnel() {
        return medicalPersonnel;
    }

    /**
     *
     * @param medicalPersonnel
     */
    public void setMedicalPersonnel(Boolean[] medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    }

    /**
     * Denies all medical personnel access to medical information. 
     */
    public void denyAllPersonnel() {
        for (int i = 0; i < medicalPersonnel.length; i++) {
            medicalPersonnel[i] = false; 
        }
    }
    
    /**
     * Allows all medical personnel access to medical information. 
     */
    public void allowAllPersonnel() {
        for (int i = 0; i < medicalPersonnel.length; i++) {
            medicalPersonnel[i] = true; 
        }
    }
    
    /**
     * Takes a custom boolean array as it's parameter. Allows user to define which 
     * medical personnel have access to medical information. 
     * @param array
     * @return
     */
    public Boolean[] togglePersonnel(Boolean array[]) {
        for (int i = 0; i < medicalPersonnel.length; i++) {
            medicalPersonnel[1] = true; 
            medicalPersonnel[1] = false;
            medicalPersonnel[1] = true;
        }
        return array; 
    }

}




