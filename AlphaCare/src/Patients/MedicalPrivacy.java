/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patients;

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

    }
    
    /**
     * Allows all medical personnel access to medical information. 
     */
    public void allowAllPersonnel() {
      
    }
    
    /**
     * Takes a custom array as it's parameter. Allows user to define which 
     * medical personnel have access to medical information. 
     * @param array
     * @return
     */
    public Boolean[] togglePersonnel(Boolean array[]) {
        return array; 
    }

}




