/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.*;
import View.AdminView;
import Model.Patients.Patient; 

import java.sql.Date;
import java.time.LocalDate;

public class AdminController {
    
    public AdminController() {
        AdminView view = new AdminView(this);
        view.createdUI();
    
        Admin admin = new Admin("Admin", "Admin");
        Login login = new Login(admin);
    
        login.authenticateUser(admin);
        if(login.authenticateUser(admin) == true) {
            successfullLogin(admin);
        }
        else{
            failedLogin();
        }   
    }
    

    private void successfullLogin(Admin admin){
        Patient patient = new Patient("John Doe", "ID12345", "Password!");
        Appointment appt = new Appointment(patient, null, Date.valueOf(LocalDate.MAX), "12:00 pm"); 
    }

    private void failedLogin(){
        System.out.println("Failed login of Admin.");  
    }

}
