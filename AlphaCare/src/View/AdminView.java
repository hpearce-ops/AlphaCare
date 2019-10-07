/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class AdminView {
    JFrame frame;

    public AdminView() {
        this.frame = new JFrame("Admin View");
    }
 
    public void createdUI() {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Simple UI");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);   
    }
}
