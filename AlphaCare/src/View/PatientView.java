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
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JList;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Data.DoctorArray;
import Data.PatientApptArray;
import Model.Admin.Appointment; 
import Model.Medical.MedicalPersonnel; 
import Model.Patients.Patient;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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


    public PatientView() {
        this.frame = new JFrame("Patient View");
        this.patientAppts = new PatientApptArray(); 
        this.appointmentList = new JList<>(patientAppts.getAptNames()); 
        this.model = new UtilDateModel();
        this.timeField = new JTextField();
        this.enter = new JButton("Enter"); 
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        this.datePanel = new JDatePanelImpl(model, p);
        this.datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }
    
    @Override
    public void userSpecificUI() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel interactionPanel = new JPanel(new GridLayout(0,2)); 
        model.setDate(2019, 11, 3);
        model.setSelected(true);
        timeField.setText("ENTER TIME HERE");
        ActionListener appointment = new AppointmentListener(); 
        ActionListener calendar = new CalendarListener();
        ListSelectionListener patient = new PatientListener();
        enter.addActionListener(appointment);
        datePicker.addActionListener(calendar);
//        doctorList.addListSelectionListener(patient);
        interactionPanel.add(appointmentList); 
//        interactionPanel.add(datePicker); 
//        interactionPanel.add(timeField); 
        buttonPanel.add(enter); 
        frame.getContentPane().add(interactionPanel, BorderLayout.NORTH); 
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        
        JTabbedPane navPane = new JTabbedPane();
        
        JPanel recordTab = new JPanel(); //medical record panel
        JLabel label1 = new JLabel();
        recordTab.add(label1);
        
        JPanel apptTab = new JPanel(); //appointment panel
        apptTab.add(interactionPanel, BorderLayout.NORTH);
        apptTab.add(buttonPanel, BorderLayout.CENTER);
//        apptTab.add(appointmentPanel, BorderLayout.SOUTH);
        
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
           Date selectedDate = (Date) datePicker.getModel().getValue();
           String selectedName = (String) doctorList.getSelectedValue();
           String selectedTime = (String) timeField.getText(); 
           MedicalPersonnel DrCarder = new MedicalPersonnel("Jane Doe", "12345678");
           Patient patient = new Patient(selectedName, "12345678", "password1"); 
           Appointment apt = new Appointment(patient, DrCarder, selectedDate, selectedTime);
           System.out.println(apt); 
        }      
    }
    
    private class CalendarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date selectedDate = (Date) datePicker.getModel().getValue();
            System.out.println(selectedDate);
        }
    }

    private class PatientListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            String selectedName = (String) doctorList.getSelectedValue();
            System.out.println(selectedName);
        }
    }    
    
}
