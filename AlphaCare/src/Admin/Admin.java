/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author david
 */
public class Admin {
    private String adminId;
    private String password;

    /**
     *
     * @param adminId
     * @param password
     */
    public Admin(String adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    /**
     *
     * @return a string object for that represents an admin's id
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * sets the admin's id for the Admin class instance
     * @param adminId
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     *
     * @return a string object representing an admin's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets the admin's password for the Admin class instance
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
