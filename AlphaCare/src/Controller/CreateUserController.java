/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.LoginController.loginView;
import View.CreateUserView;

/**
 *
 * @author david
 */
public class CreateUserController {
    public static CreateUserView createUserView;

    public CreateUserController() {
        createUserView = new CreateUserView(this);
        createUserView.setVisible(true);
        loginView.setVisible(false);
    }
}
