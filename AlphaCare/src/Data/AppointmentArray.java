/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Admin.Appointment;
import Model.Medical.MedicalPersonnel;
import Model.Patients.Patient;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentArray {
    private ArrayList<Appointment> appointmentList;
    
    public AppointmentArray(){
        
    }
    public void makeAppointment(Patient patient, MedicalPersonnel medicalPersonnel, Date date, String time){
        appointmentList.add(new Appointment(patient,medicalPersonnel, date, time));
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
