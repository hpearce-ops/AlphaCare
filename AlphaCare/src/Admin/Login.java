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
     *
     * @param adminID
     * @param passWord
     */
    public Login(String adminID, String passWord) {
        this.adminID = adminID;
        this.passWord = passWord;
    }

    /**
     *
     * @return
     */
    public String getAdminID() {
        return adminID;
    }

    /**
     *
     * @param adminID
     */
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    /**
     *
     * @return
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
