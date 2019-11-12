package View;

import Controller.CreateUserController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public final class CreateUserView extends JFrame{
    private final CreateUserController createUserController;

    public CreateUserView(CreateUserController createUserController) {
        this.createUserController = createUserController;
        createComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createComponents() {
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        JButton checkPassWordButton = new JButton("Check Password Strength");
        JLabel userNameLabel = new JLabel("Username:");
        JTextField userNameField = new JTextField(15);
        JTextField passWordField = new JTextField(15);
        JTextField confirmPassWordField = new JTextField(15);
        panel.add(userNameLabel);
        panel.add(userNameField);
        panel.add(new JLabel("Password: "));
        panel.add(passWordField);
        panel.add(new JLabel("Confirm Password: "));
        panel.add(confirmPassWordField);
        panel.add(new JLabel("Password must contain at least one digit, one uppercase letter, one lower case letter, and be 7 or more "
                + "characters long"));
        
        JPanel strengthPanel = new JPanel();
        strengthPanel.setSize(500, 100);
        
        checkPassWordButton.addActionListener(e -> {
            strengthPanel.removeAll();
            strengthPanel.setOpaque(false);
            if(checkPasswordStrength(confirmPassWordField.getText()) && confirmPassWordField.getText().equals(passWordField.getText())){
                strengthPanel.setOpaque(true);
                strengthPanel.setBackground(Color.green);
            }else if(checkPasswordStrength(confirmPassWordField.getText()) && !confirmPassWordField.getText().equals(passWordField.getText())){
                strengthPanel.add(new JLabel("Password fields do not match"));
                strengthPanel.updateUI();
            }else{
                strengthPanel.setOpaque(true);
                strengthPanel.setBackground(Color.red);
            }
        });
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setSize(500,100);
        buttonPanel.add(checkPassWordButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(strengthPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private boolean checkPasswordStrength(String passWord) {
        int len = passWord.length();
        int digit = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int count = 0;
        char ch;
        if (len >= 7) {
            while (count < len) {
                ch = passWord.charAt(count);
                if (Character.isDigit(ch)) {
                    digit = digit + 1;
                }
                if (Character.isLowerCase(ch)) {
                    lowerCase = lowerCase + 1;
                }
                if (Character.isUpperCase(ch)) {
                    upperCase = upperCase + 1;
                }
                count = count + 1;
            }
        }
        if (digit >= 1 && lowerCase >= 1 && upperCase >= 1) {
            return true;
        } else {
            return false;
        }
    }
}

