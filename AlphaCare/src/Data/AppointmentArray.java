/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Admin.Appointment;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author henrypearce
 */
public class AppointmentArray {

    final ArrayList<Appointment> aptList;
    final PatientArray patient;
    final DoctorArray doctor;

    public AppointmentArray() {
        this.aptList = new ArrayList<>();
        this.patient = new PatientArray();
        this.doctor = new DoctorArray();
        populateArray();
    }

    private void populateArray() {
        Date date = new Date();
        aptList.add(new Appointment(patient.findPatient("Jane Doe"), doctor.findDoc("Floyd Collins"), date, "11:00 am"));
    }

    public String[] getPatientAptNames(String patName) {
        ArrayList<String> appointmentList = new ArrayList<>();
        for (int i = 0; i < aptList.size(); i++) {
            if (patName.equals(aptList.get(i).getPatient().getPatientName())) {
                appointmentList.add(aptList.get(i).getAppointment());
            }
        }
        String[] aptArray = appointmentList.toArray(new String[appointmentList.size()]);
        return aptArray;
    }

    public String[] getAptNames() {
        ArrayList<String> appointmentList = new ArrayList<>();
        for (int i = 0; i < aptList.size(); i++) {
            appointmentList.add(aptList.get(i).getAppointment());
        }
        String[] aptArray = appointmentList.toArray(new String[appointmentList.size()]);
        return aptArray;
    }

    public ArrayList<Appointment> getAppointmentList() {
        return aptList;
    }

    public Appointment findAppointment(String apt) {
        Appointment temp = null;
        for (int i = 0; i < aptList.size(); i++) {
            if (apt.equals(aptList.get(i).getAppointment())) {
                temp = aptList.get(i);
            }
        }
        return temp;
    }

    public void deleteAppointment(Appointment appointment) {
        for (int i = 0; i < aptList.size(); i++) {
            if (appointment == aptList.get(i)) {
                aptList.remove(i);
            }
        }
    }
}
