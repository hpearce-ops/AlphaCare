/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Login.LoginInterface;

/**
 *
 * @author henrypearce
 */
public class Login implements LoginInterface{

    private Admin admin;

    /**
     * constructor for Login class
     * @param admin
     */
    public Login(Admin admin) {
        this.admin = admin;
    }

    /**
     * 
     * @return returns an Admin object for the Login class instance
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * sets the Admin object for the Login class instance
     * @param admin
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
        /**
     * Checks to see if the user input is valid. 
     * @param admin
     * @return Will return false if check fails and true if check succeeds. 
     */
    public Boolean authenticateUser(Admin admin){
        return true || false; 
    }

    @Override
    public boolean authenticateUser() {
        return true || false;
    }

}
