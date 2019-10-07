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
public class Login {

    private Patient patient;

    /**
     *
     * This is the default constructor for login.
     * @param patient
     */
    public Login(Patient patient) {
        this.patient = patient;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    /**
     * Checks to see if the user input is valid. 
     * @param patient
     * @return Will return false if check fails and true if check succeeds. 
     */
    public Boolean authenticateUser(Patient patient){
        return true || false; 
    }
    

}
