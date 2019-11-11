/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Medical.MedicalPersonnel;
import Model.Patients.Patient;
import java.util.Date;

/**
 *
 * @author david
 */
public class Appointment {
    private Patient patient;
    private MedicalPersonnel medicalPersonnel;
    private Date date;
    private String time;

    /**
     *
     * @param patient
     * @param medicalPersonnel
     * @param date
     * @param time
     */
    public Appointment(Patient patient, MedicalPersonnel medicalPersonnel, Date date, String time) {
        this.patient = patient;
        this.medicalPersonnel = medicalPersonnel;
        this.date = date;
        this.time = time;
    }

    /**
     *
     * @return a Date object for the appointment date
     */
    public Date getDate() {
        return date; 
    }

    /**
     * sets the Date for the Appointment instance
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return a LocalTime object for Appointment instance
     */
    public String getTime() {
        return time;
    }

    /**
     * sets the LocalTime for the Appointment instance
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return a Patient object for the Appointment instance
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * sets the Patient object for the Appointment instance
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     *
     * @return a MedicalPersonnel object for the Appointment instance
     */
    public MedicalPersonnel getMedicalPersonnel() {
        return medicalPersonnel;
    }

    /**
     * sets the MedicalPersonnel object for the Appointment instance
     * @param medicalPersonnel
     */
    public void setMedicalPersonnel(MedicalPersonnel medicalPersonnel) {
        this.medicalPersonnel = medicalPersonnel;
    }
    
    public String getRealDate() {
        String temp = date.toString().substring(0, 9); 
        return temp;
    }
    
    public String getAppointment(){
        return patient.getPatientName() + ", " + medicalPersonnel.getPersonnelID() + ", " + getRealDate() + ", " + time; 
    }
    
    
}
