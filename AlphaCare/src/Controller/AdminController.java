/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.*;
import View.AdminView;

import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class AdminController {
    AdminView view = new AdminView();
    view.createdUI();
    
    Admin admin = new Admin("Admin", "Admin");
    Login login = new Login(admin);
    
    login.authenticateUser(admin);
    if(login.authenticateUser(admin) == true) {
        successfulLogin(admin);
    }
    else{
        failedLogin();
    }   
}

private void succefulLogin(Admin admin){
        Appointment appt = new Appointment(patient, null, Date.valueOf(LocalDate.MAX), LocalTime.NOON); 
}

private void failedLogin(){
   System.out.println("Failed login of Admin.");  
}
