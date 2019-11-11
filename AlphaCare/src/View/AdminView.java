/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
//import Model.Medical.MedicalPersonnel;
//import Model.Patients.Patient;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class AdminView extends AbstractView {

    public AdminView() {
        this.frame = new JFrame("Admin View");
        this.patients = new PatientArray();
        this.doctors = new DoctorArray();
        this.patientList = new JList<>(patients.getArrayNames());
        this.doctorList = new JList<>(doctors.getArrayDocs()); 
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
        JPanel interactionPanel = new JPanel(new GridLayout(0, 2));
        JPanel appointmentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        model.setDate(2019, 11, 3);
        model.setSelected(true);
        timeField.setText("ENTER TIME HERE");
        ActionListener appointment = new AppointmentListener();
        enter.addActionListener(appointment);
        interactionPanel.add(new JLabel("Patients")); 
        interactionPanel.add(new JLabel("Medical Personnel"));
        interactionPanel.add(patientList);
        interactionPanel.add(doctorList); 
        interactionPanel.add(datePicker);
        interactionPanel.add(timeField);
        buttonPanel.add(enter);
        frame.getContentPane().add(interactionPanel, BorderLayout.NORTH);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
    }

    private class AppointmentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Appointment apt = new Appointment(patients.findPatient((String) patientList.getSelectedValue()), 
                    doctors.findDoc((String) doctorList.getSelectedValue()), 
                    (Date) datePicker.getModel().getValue(), (String) timeField.getText());
            System.out.println(apt.getAppointment());
            AppointmentView view = new AppointmentView(apt);
            view.createdUI();
        }
    }

//    private class CalendarListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            Date selectedDate = (Date) datePicker.getModel().getValue();
//            System.out.println(selectedDate);
//        }
//    }
//    private class PatientListener implements ListSelectionListener {
//        @Override
//        public void valueChanged(ListSelectionEvent e) {
//            String selectedName = (String) patientList.getSelectedValue();
//            System.out.println(selectedName);
//        }
//    }
}
