/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Controller.*; 

/**
 *
 * @author henrypearce
 */
public class AlphaCare {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        selectUserAPI(1);       
        selectUserAPI(2);
        selectUserAPI(3); 
    }
    
    /**
     * Based on an integer value, the method will call the login method for the desired API.
     * 1 = Administrator
     * 2 = Medical Personnel
     * 3 = Patient
     * @param selection
     */
    public static void selectUserAPI(int selection) {
        if (selection == 1) {
            AdminController admin = new AdminController();  
        }
        else if (selection == 2) {
            MedicalController medical = new MedicalController(); 
        }
        else if (selection == 3) {
            PatientController patient = new PatientController();
        }
        //if statements and other login method calls (methods can be found in respective packages). 
    }
    
}
