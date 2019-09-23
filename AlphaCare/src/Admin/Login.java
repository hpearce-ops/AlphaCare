/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author henrypearce
 */
public class Login {

    private String adminID;
    private String passWord;

    /**
     * this is the constructor for Admin users 
     * @param adminID
     * @param passWord
     */
    public Login(String adminID, String passWord) {
        this.adminID = adminID;
        this.passWord = passWord;
    }

    /**
     *
     * @return the admin id as a string object
     */
    public String getAdminID() {
        return adminID;
    }

    /**
     * takes a string as a parameter in order to set the admin id for the admin instance
     * @param adminID
     */
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    /**
     *
     * @return the admin's password as a string object
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * takes a string as a parameter in order to set the admin's password for the admin instance
     * @param passWord 
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
