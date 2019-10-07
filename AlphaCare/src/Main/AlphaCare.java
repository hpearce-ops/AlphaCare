/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Controller.PatientController; 
/**
 *
 * @author henrypearce
 */
public class AlphaCare {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection = 0; 
        //listeners will determine which button user presses. 
        selectUserAPI(selection); 
        
        PatientController patient = new PatientController();  
    }
    
    /**
     * Based on an integer value, the method will call the login method for the desired API.
     * 1 = Administrator
     * 2 = Medical Personnel
     * 3 = Patient
     * @param selection
     */
    public static void selectUserAPI(int selection) {
        String API = "";  
        //if statements and other login method calls (methods can be found in respective packages). 
    }
    
}
