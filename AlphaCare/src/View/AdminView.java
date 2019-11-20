/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AdminController;
import Data.AppointmentArray;
import Data.DoctorArray;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JList;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Data.PatientArray;
import Model.Admin.Appointment;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class AdminView extends AbstractView {

    JButton delete;
    private final AdminController adminCntl;

    public AdminView(AdminController adminCntl) {
        this.frame = new JFrame("Admin View");
        this.NAVIGATION = new JLabel("Use Case Navigation: Please select a patient, doctor, date, and enter a time. Then press enter!");
        this.patients = new PatientArray();
        this.doctors = new DoctorArray();
        this.appointments = new AppointmentArray();
        this.patientList = new JList<>(patients.getArrayNames());
        this.doctorList = new JList<>(doctors.getArrayDocs());
        this.appointmentList = new JList<>(appointments.getAptNames());
        this.model = new UtilDateModel();
        this.timeField = new JTextField();
        this.enter = new JButton("Enter");
        this.delete = new JButton("Delete");
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        this.datePanel = new JDatePanelImpl(model, p);
        this.datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        this.adminCntl = adminCntl;
    }

    @Override
    public void userSpecificUI() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel interactionPanel = new JPanel(new GridLayout(0, 2));
        JPanel appointmentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        model.setDate(2019, 11, 3);
        model.setSelected(true);
        timeField.setText("00:00 am");
        ActionListener appointment = new AppointmentListener();
        enter.addActionListener(appointment);
        delete.addActionListener(appointment);
        interactionPanel.add(new JLabel("Patients"));
        interactionPanel.add(new JLabel("Medical Personnel"));
        interactionPanel.add(patientList);
        interactionPanel.add(doctorList);
        interactionPanel.add(datePicker);
        interactionPanel.add(timeField);
        buttonPanel.add(enter);
        buttonPanel.add(NAVIGATION);
        appointmentPanel.add(appointmentList);
        appointmentPanel.add(delete);
        
        //make navigation tabs
        JTabbedPane navPane = new JTabbedPane();
        
        JPanel doctorTab = new JPanel(); //doctor panel
        JLabel label1 = new JLabel();
        doctorTab.add(label1);
        
        JPanel apptTab = new JPanel(); //appointment panel
        apptTab.add(interactionPanel, BorderLayout.NORTH);
        apptTab.add(buttonPanel, BorderLayout.CENTER);
        apptTab.add(appointmentPanel, BorderLayout.SOUTH);
        
        JPanel settingsTab = new JPanel(); //settings panel
        JLabel label3 = new JLabel();
        label3.setText("Medical Record Area"); 
        settingsTab.add(label3);
        
        navPane.addTab("Staff", doctorTab);
        navPane.addTab("Appointments", apptTab);
        navPane.addTab("Settings", settingsTab);
        
        frame.getContentPane().add(navPane);       
    }

    private class AppointmentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == enter) {
                Appointment apt = new Appointment(patients.findPatient((String) patientList.getSelectedValue()),
                        doctors.findDoc((String) doctorList.getSelectedValue()),
                        (Date) datePicker.getModel().getValue(), (String) timeField.getText());
                appointments.getAppointmentList().add(apt);
                DefaultListModel model = new DefaultListModel();
                String[] temp = appointments.getAptNames();
                for (String temp1 : temp) {
                    model.addElement(temp1);
                }
                appointmentList.setModel(model);
                NAVIGATION.setText("Use Case Navigation: Below, you can also delete appointments if there is an error.");
            } else if (e.getSource() == delete) {
                Appointment apt = appointments.findAppointment((String) appointmentList.getSelectedValue());
                appointments.deleteAppointment(apt);
                DefaultListModel model = new DefaultListModel();
                String[] temp = appointments.getAptNames();
                for (String temp1 : temp) {
                    model.addElement(temp1);
                }
                appointmentList.setModel(model);
            }
        }
    }

}
