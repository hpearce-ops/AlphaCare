/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patients;

/**
 *
 * @author henrypearce
 */
public class AccountPrivacy {
     private String accountID;

    /**
     * Default constructor for AccountPrivacy
     * @param accountID
     */
    public AccountPrivacy(String accountID) {
        this.accountID = accountID;
    }

    /**
     *
     * @return
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     *
     * @param accountID
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * Check to see if the accountID exists. Returns true if it does and false if it does not. 
     * @param accountID
     * @return
     */
    public Boolean verifyID(String accountID){
        return true || false; 
    }
    
    /**
     * Used to remove accountID from the approved list. Can also be used to cancel the addition of a new ID. 
     * @param accountID
     */
    public void removedAddition(String accountID){
        
    }

    /**
     * Used to approve the addition of a new accountID to the user's list of approved accounts. 
     * @param accountID
     */
    public void approveAddition(String accountID){
        
    }
}



