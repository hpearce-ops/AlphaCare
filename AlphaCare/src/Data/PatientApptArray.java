/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Admin.Appointment;
import java.util.Date;

/**
 *
 * @author henrypearce
 */
public class PatientApptArray extends AppointmentArray {
    
    public PatientApptArray() {
        populateArray(); 
    }

    private void populateArray() {
        aptList.clear();
        Date date = new Date();
        aptList.add(new Appointment(patient.findPatient("Robert Redford"), doctor.findDoc("Floyd Collins"), date, "11:00 am"));  
        aptList.add(new Appointment(patient.findPatient("Robert Redford"), doctor.findDoc("Demi Gawd"), date, "12:00 pm"));
        aptList.add(new Appointment(patient.findPatient("Robert Redford"), doctor.findDoc("John Smith"), date, "5:00 pm")); 
        aptList.get(0).setStatus(Boolean.TRUE);
    }
    
    
}
