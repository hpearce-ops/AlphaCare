/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical;

/**
 *
 * @author henrypearce
 */
public class Login {
    private String personnelID;
    private String passWord; 

    /**
     *
     * @param personnelID
     * @param passWord
     */
    public Login(String personnelID, String passWord) {
        this.personnelID = personnelID;
        this.passWord = passWord;
    }

    /**
     *
     * @return
     */
    public String getPersonnelID() {
        return personnelID;
    }

    /**
     *
     * @param personnelID
     */
    public void setPersonnelID(String personnelID) {
        this.personnelID = personnelID;
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
