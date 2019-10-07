/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*; 

/**
 *
 * @author david
 */
public class PatientView {
    JFrame frame;

    public PatientView() {
        this.frame = new JFrame("Patient View");
    }
 
    public void createdUI() {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Simple UI");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);   
    }
}
