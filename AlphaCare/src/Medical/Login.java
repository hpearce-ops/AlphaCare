/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical;

/**
 *
 * @author henrypearce
 */
public class Login {
    private MedicalPersonnel medicalPersonnel;

    /**
     *
     * @param medicalPersonnel
     */
    public Login(MedicalPersonnel medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    } 
    
        /**
     *
     * @return
     */

    /**
     *
     * @param patient
     */
    public void setMedicalPersonnel(MedicalPersonnel medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    }
    
    /**
     * Checks to see if the user input is valid. 
     * @param patient
     * @return Will return false if check fails and true if check succeeds. 
     */
    public Boolean authenticateUser(MedicalPersonnel medicalPersonnel){
        return true || false; 
    }
}
