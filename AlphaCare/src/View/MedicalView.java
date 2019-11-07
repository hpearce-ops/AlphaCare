/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author david
 */
public class MedicalView {
    JFrame frame;

    public MedicalView() {
        this.frame = new JFrame("Medical View");
        createdUI();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public void createdUI() {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,500);
       JButton button = new JButton("Simple UI");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);   
        
        //navigation pane created below
        JTabbedPane navPane = new JTabbedPane();
        frame.getContentPane().add(navPane);
        
        JPanel p1 = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("Patient Info Area");
        p1.add(label1);
        
        JPanel p2 = new JPanel();
        JLabel label2 = new JLabel();
        label2.setText("Patient Appointment Area");
        p2.add(label2);
        
        JPanel p3 = new JPanel();
        JLabel label3 = new JLabel();
        label3.setText("Medical Record Area"); 
        p3.add(label3);
        
        navPane.addTab("Patient", p1);
        navPane.addTab("Appointments", p2);
        navPane.addTab("Medical Record", p3);
        
    } 
}
