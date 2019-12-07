/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginView;

/**
 *
 * @author mtd52
 */
public class LoginController {
    protected static LoginView loginView;

        
    public LoginController(){
        loginView = new LoginView(this);
        loginView.setVisible(true);
    }
    
    public void createUser(){
        CreateUserController createCntl = new CreateUserController();
    }
}
