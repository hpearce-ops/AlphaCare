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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author david
 */
public class PatientView extends AbstractView {

    private final DoctorArray doctors;
    private final JList<String> doctorList;
    private final JTextField giveAccessField;

    public PatientView() {
        this.giveAccessField = new JTextField(20);
        this.frame = new JFrame("Patient View");
        this.doctors = new DoctorArray();
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
        JPanel accessPanel = new JPanel();
        model.setDate(2019, 11, 3);
        model.setSelected(true);
        timeField.setText("ENTER TIME HERE");
        ActionListener appointment = new AppointmentListener();
        ActionListener calendar = new CalendarListener();
        ListSelectionListener patient = new PatientListener();
        enter.addActionListener(appointment);
        datePicker.addActionListener(calendar);
        doctorList.addListSelectionListener(patient);
        interactionPanel.add(doctorList);
        interactionPanel.add(datePicker);
        interactionPanel.add(timeField);
        interactionPanel.add(giveAccessField);
        buttonPanel.add(enter);
        JButton accessButton = new JButton("Give access to family members");
        giveAccessField.setText("Give Name Access Here");
        accessButton.addActionListener(e -> createAndWriteUserAccessFile());
        accessPanel.add(giveAccessField);
        accessPanel.add(accessButton);
        frame.getContentPane().add(interactionPanel, BorderLayout.NORTH);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        frame.getContentPane().add(accessPanel, BorderLayout.CENTER);
        //gives access of medical information to other family members

    }

    private void createAndWriteUserAccessFile() {
        String fileName = "medInfoAccess.txt";
        ArrayList<String> accessList = new ArrayList<>();
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter buffWriter = new BufferedWriter(fileWriter)) {
                    try (FileWriter fileWriter1 = new FileWriter(file, false)) {
                        fileWriter1.write("");
                    }
                    if ((giveAccessField.getText().isEmpty())) {
                        fillInDataPopup();
                    } else {
                        String userName = giveAccessField.getText().toLowerCase();
                        if (!accessList.contains(userName)) {
                            accessList.add(userName);
                            for (String name : accessList) {
                                buffWriter.write(name + "\n");
                                buffWriter.newLine();
                                buffWriter.flush();
                            }
                            addUserMessage();
                        } else {
                            didNotAddMessage();
                        }
                    }
                    buffWriter.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

        private void addUserMessage() {
        String message = "User has been added to medInfoAccess.txt";
        JOptionPane.showMessageDialog(null, message, "Added User", JOptionPane.INFORMATION_MESSAGE);
    }

    private void didNotAddMessage() {
        String message = "User has already been entered into the system.  Please enter a different first and last name pairing";
        JOptionPane.showMessageDialog(null, message, "Add New User Deficiency", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void fillInDataPopup() {
        String message = "Please fill in the required fields";
        JOptionPane.showMessageDialog(null, message, "Info Needed to Add", JOptionPane.INFORMATION_MESSAGE);
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
