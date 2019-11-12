/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Admin.Appointment;
import Model.Patients.Patient;
import java.util.ArrayList;

public class AppointmentArray {
    private ArrayList<Appointment> appointmentList;
    
    public AppointmentArray(){
        appointmentList = new ArrayList<>();
    }
    public void makeAppointment(Appointment apt){
        appointmentList.add(apt);
    }
    public Appointment getAppointments(Patient patient){
        for(int i = 0; i < appointmentList.size();i++){
            if(patient.getPatientName().equals(appointmentList.get(i).getPatient().getPatientName())){
                return appointmentList.get(i);
            }
            else{
                return null;
            }
        }
        return null;
    }
}
