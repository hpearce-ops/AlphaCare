/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Admin.Appointment;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author henrypearce
 */
public class AppointmentView extends AbstractView {  
    Appointment apt;
    JButton no; 

    public AppointmentView(Appointment apt) {
        this.frame = new JFrame("Admin View");
        this.apt = apt;
        this.enter = new JButton("Yes");
        this.no = new JButton("No"); 
    }
    
    @Override
    public void userSpecificUI() {
        frame.setSize(500, 200);
        JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        JPanel interactionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel buttonPanel = new JPanel(new GridLayout(0, 2));
        ActionListener outcome = new AppointmentView.OutcomeListener();
        enter.addActionListener(outcome);
        no.addActionListener(outcome);
        textPanel.add(new JLabel("Please verify the following appointment is correct."));
        interactionPanel.add(new JLabel(apt.getAppointment())); 
        buttonPanel.add(enter);
        buttonPanel.add(no); 
        frame.getContentPane().add(textPanel, BorderLayout.NORTH); 
        frame.getContentPane().add(interactionPanel, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private class OutcomeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == enter) {
                frame.setVisible(false);
                frame.dispose();
            } else if (e.getSource() == no) {
                
            }
        }
    }
    
    
    
}
