/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AdminController;
import Controller.LoginController;
import Controller.MedicalController;
import Controller.PatientController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mtd52
 */
public final class LoginView extends JFrame {

    private final LoginController loginController;
    private JPanel loginPanel;
    private final JTextField userID = new JTextField(50);
    private final JTextField password = new JTextField(50);

    private final JLabel NAVIGATION1 = new JLabel("Use Case Navigation: ");
    private final JLabel NAVIGATION2 = new JLabel("Please log in with the username and password as 'admin'.");
    private final JLabel NAVIGATION3 = new JLabel("This use case will demonstrate how administrators can create and delete appointments.");

    public LoginView(LoginController loginController) {
        this.loginController = loginController;
        loginComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void loginComponents() {
        setTitle("Alpha Care");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setContentPane(new JPanel(new BorderLayout()));
        //Create LoginPanel with entry fields
        loginPanel = new JPanel();

        JPanel idPanel = new JPanel();
        idPanel.add(new JLabel("User ID"));
        idPanel.add(userID);

        JPanel passPanel = new JPanel();
        passPanel.add(new JLabel("Password"));
        passPanel.add(password);

        loginPanel.add(idPanel);
        loginPanel.add(passPanel);
        loginPanel.add(NAVIGATION1);
        loginPanel.add(NAVIGATION2);
        loginPanel.add(NAVIGATION3);

        getContentPane().add(loginPanel);

        //buttonPanel created
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton loginButton = new JButton("Login");
        JButton createUserButton = new JButton("Create User");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(loginButton);
        buttonPanel.add(createUserButton);
        buttonPanel.add(exitButton);

        loginButton.addActionListener(event -> login());
        createUserButton.addActionListener(event -> createUser());
        exitButton.addActionListener(event -> exitApp());
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void login() {
        String userIDText = userID.getText();
        String passwordText = password.getText();
        if (userIDText.equals("admin") && passwordText.equals("admin")) {
            AdminController admin = new AdminController();
            setVisible(false);
        } else if (userIDText.equals("medical") && passwordText.equals("medical")) {
            MedicalController medical = new MedicalController();
            setVisible(false);
        } else if (userIDText.equals("patient") && passwordText.equals("patient")) {
            PatientController patient = new PatientController();
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid credentials");
        }
    }

    private void createUser() {
        this.loginController.createUser();
    }

    private void exitApp() {
        System.exit(0);
    }
}
