/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patients.*; 
import View.PatientView; 
import Model.Admin.Appointment;
import java.io.File;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author david
 */
public class PatientController {

    public PatientController() {
        PatientView view = new PatientView(); 
        view.createdUI();
        
        Patient patient = new Patient("Jane Doe", "ID12345", "Password!"); 
        Login login = new Login(patient); 
        
        login.authenticateUser(patient); 
        if (login.authenticateUser(patient) == true) {
            successfulLogin(patient); 
        } else {
            failedLogin(); 
        }
    }

    private void successfulLogin(Patient patient) {
        MedicalRecord medRecord = new MedicalRecord(patient.getPatientID(), "John Doe"); 
        File a = new File("record.txt");
        medRecord.uploadMedicalRecord(a);
        medRecord.deleteMedicalRecord();
        Boolean[] medicalPersonnel = new Boolean[]{true, true, true}; 
        MedicalPrivacy medPrivacy = new MedicalPrivacy(medicalPersonnel); 
        medPrivacy.allowAllPersonnel();
        medPrivacy.denyAllPersonnel();
        medPrivacy.togglePersonnel(medicalPersonnel); 
        AccountPrivacy accPrivacy = new AccountPrivacy("ID98765"); 
        accPrivacy.approveAddition(accPrivacy.getAccountID());
        accPrivacy.removedAddition(accPrivacy.getAccountID());
        Appointment appt = new Appointment(patient, null, Date.valueOf(LocalDate.MAX), "12:00 pm"); 
        AppointmentManage apptManage = new AppointmentManage(appt);
        apptManage.accept();
        apptManage.deny(); 
    }

    private void failedLogin() {
        System.out.println("Failed login of patient."); 
    }
   
}
