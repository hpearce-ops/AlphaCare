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
import Model.Admin.Appointment; 
import Model.Medical.MedicalPersonnel; 
import Model.Patients.Patient;

import javax.swing.JButton;
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
        this.medicalPersonell = new DoctorArray();
        this.medList = new JList<>(medicalPersonell.getArrayDocs());
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
        model.setDate(2019, 11, 3);
        model.setSelected(true);
        timeField.setText("ENTER TIME HERE");
        ActionListener appointment = new AppointmentListener(); 
        ActionListener calendar = new CalendarListener();
        ListSelectionListener patient = new PatientListener();
        enter.addActionListener(appointment);
        datePicker.addActionListener(calendar);
        medList.addListSelectionListener(patient);
        frame.getContentPane().add(enter, BorderLayout.NORTH); 
        frame.getContentPane().add(datePicker, BorderLayout.LINE_START);
        frame.getContentPane().add(medList, BorderLayout.LINE_END);
        frame.getContentPane().add(timeField, BorderLayout.SOUTH); 
    }

    private class AppointmentListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           Date selectedDate = (Date) datePicker.getModel().getValue();
           String selectedName = (String) medList.getSelectedValue();
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
            String selectedName = (String) medList.getSelectedValue();
            System.out.println(selectedName);
        }
    }    
    
}
