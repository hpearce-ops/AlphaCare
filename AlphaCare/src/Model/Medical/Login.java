/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medical;
import Login.LoginInterface;
/**
 *
 * @author henrypearce
 */
public class Login implements LoginInterface{
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
     * @param medicalPersonnel
     */
    public void setMedicalPersonnel(MedicalPersonnel medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    }
    
    /**
     *
     * @return a MedicalPersonnel object
     */
    public MedicalPersonnel getMedicalPersonnel(){
        return this.medicalPersonnel;
    }
    
    /**
     * Checks to see if the user input is valid. 
     * @param medicalPersonnel
     * @return Will return false if check fails and true if check succeeds. 
     */
    public Boolean authenticateUser(MedicalPersonnel medicalPersonnel){
        return true || false; 
    }

    @Override
    public boolean authenticateUser() {
        return true || false;
    }
}
