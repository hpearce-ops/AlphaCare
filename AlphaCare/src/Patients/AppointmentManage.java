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
public class AppointmentManage {
    private appointment appt; 
    //appointment class found in the Admin API

    /**
     * Default constructor for class. 
     * @param appt
     */
    public AppointmentManage(appointment appt) {
        this.appt = appt;
    }
    
    /**
     * Confirms the appointment on behalf of the patient. 
     * @return
     */
    public Boolean accept(){
        return true; 
    }
    
    /**
     * Cancels the appointment on behalf of the patient. 
     * @return
     */
    public Boolean deny(){
        return false; 
    }
}
