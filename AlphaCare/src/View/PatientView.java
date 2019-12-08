/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JList;

import Data.PatientApptArray;
import Model.Admin.Appointment;
import Model.Medical.MedicalPersonnel;
import Model.Patients.Patient;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author david
 */
public class PatientView extends AbstractView {

    private final JList trueList;
    private final JList falseList;
    private final JButton undo; 

    public PatientView() {
        this.frame = new JFrame("Patient View");
        this.patientAppts = new PatientApptArray();
        this.appointmentList = new JList<>(patientAppts.appointmentStatusSort());
        this.trueList = new JList<>(patientAppts.getTrueList());
        this.falseList = new JList<>(patientAppts.getFalseList());
        this.enter = new JButton("Confirm");
        this.exit = new JButton("Cancel");
        this.undo = new JButton("Undo"); 
    }

    @Override
    public void userSpecificUI() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel interactionPanel = new JPanel(new GridLayout(0, 1));

        JLabel waitingLabel = new JLabel("Waiting for Approval");
        JLabel approveLabel = new JLabel("Approved Appointments");
        JLabel cancelLabel = new JLabel("Cancelled Appointments");

        ActionListener appointment = new AppointmentListener();

        enter.addActionListener(appointment);
        exit.addActionListener(appointment);
        undo.addActionListener(appointment);
        
        buttonPanel.add(enter);
        buttonPanel.add(exit);
        buttonPanel.add(undo);
        
        interactionPanel.add(waitingLabel);
        interactionPanel.add(appointmentList);
        interactionPanel.add(buttonPanel);
        interactionPanel.add(approveLabel);
        interactionPanel.add(trueList);
        interactionPanel.add(cancelLabel);
        interactionPanel.add(falseList);

        JTabbedPane navPane = new JTabbedPane();

        JPanel recordTab = new JPanel(); //medical record panel
        JLabel label1 = new JLabel();
        recordTab.add(label1);

        JPanel apptTab = new JPanel(); //appointment panel
        apptTab.add(interactionPanel, BorderLayout.NORTH);

        JPanel settingsTab = new JPanel(); //settings panel
        JLabel label3 = new JLabel();
        label3.setText("Security Settings Area");
        settingsTab.add(label3);

        navPane.addTab("Medical Record", recordTab);
        navPane.addTab("Appointments", apptTab);
        navPane.addTab("Settings", settingsTab);

        frame.getContentPane().add(navPane);

    }

    private class AppointmentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == enter) {
                String temp = (String) appointmentList.getSelectedValue();
                Appointment apt = patientAppts.findAppointment(temp);
                apt.setStatus(Boolean.TRUE);
            } else if (e.getSource() == exit) {
                String temp = (String) appointmentList.getSelectedValue();
                Appointment apt = patientAppts.findAppointment(temp);
                apt.setStatus(Boolean.FALSE);
            } else if (e.getSource() == undo) {
                String temp = (String) appointmentList.getSelectedValue();
                if (temp == null) {
                    temp = (String) trueList.getSelectedValue(); 
                }
                if (temp == null) {
                    temp = (String) falseList.getSelectedValue();
                }
                Appointment apt = patientAppts.findAppointment(temp);
                apt.setStatus(null);
            }
             updateLists(); 
        }

        private void updateLists() {
            DefaultListModel model = new DefaultListModel();
            String[] tempNull = patientAppts.appointmentStatusSort();
            String[] tempTrue = patientAppts.getTrueList();
            String[] tempFalse = patientAppts.getFalseList();
            appointmentList.setModel(resetModel(tempNull));
            trueList.setModel(resetModel(tempTrue));
            falseList.setModel(resetModel(tempFalse));
        }

        private DefaultListModel resetModel(String[] temp) {
            DefaultListModel model = new DefaultListModel();
            for (String temp1 : temp) {
                model.addElement(temp1);
            }
            return model;
        }

    }

}
