/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Medical;
import View.MedicalView;

/**
 *
 * @author david
 */
public class MedicalController {

    private MedicalController(){
        MedicalView view = new MedicalView();
        view.createdUI;
        
        MedicalPersonnel personnel = new MedicalPersonnel("ABC123","PASSWORD");
        Login login = new Login(personnel);
        login.setMedicalPersonnel(personnel);
        if(login.authenticateUser(personnel)){
            System.out.println("login successfull);
        }else{
            System.out.println("login fail);
        }                       
    }
}

