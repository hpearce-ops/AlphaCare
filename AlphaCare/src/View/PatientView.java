/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Data.DoctorArray;
import Model.Medical.MedicalPersonnel;
import Model.Patients.Patient;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Data.PatientApptArray;
import Model.Admin.Appointment;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Date;
import java.util.Properties;
import javax.swing.DefaultListModel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author david
 */
public class PatientView extends AbstractView {

    private final DoctorArray doctors;
    private final JList<String> doctorList;
    private final JTextField giveAccessField;

    private final JList trueList;
    private final JList falseList;
    private final JButton undo;

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
        JPanel interactionPanel = new JPanel(new GridLayout(0, 2));
        JPanel accessPanel = new JPanel(new GridLayout(0,1));
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
        buttonPanel.add(enter);
        JLabel useCaseLabel1 = new JLabel("For use case 3: Give Medical Access to other people");
        JLabel useCaseLabel2 = new JLabel("Type a name into the text field and click the Give Access Button");
        JLabel useCaseLabel3 = new JLabel("Check in the files section of the program and look for the medInfoAccess.txt file");
        JButton accessButton = new JButton("Give access to family members");
        giveAccessField.setText("Give Name Access Here");
        accessButton.addActionListener(e -> createAndWriteUserAccessFile());
        accessPanel.add(useCaseLabel1);
        accessPanel.add(useCaseLabel2);
        accessPanel.add(useCaseLabel3);
        accessPanel.add(giveAccessField);
        accessPanel.add(accessButton);
        

        JLabel waitingLabel = new JLabel("Waiting for Approval");
        JLabel approveLabel = new JLabel("Approved Appointments");
        JLabel cancelLabel = new JLabel("Cancelled Appointments");

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
        recordTab.add(accessPanel, BorderLayout.CENTER);

        JPanel apptTab = new JPanel(); //appointment panel

        apptTab.add(interactionPanel, BorderLayout.NORTH);

        JPanel settingsTab = new JPanel(); //settings panel
        JLabel label3 = new JLabel();

        label3.setText(
                "Security Settings Area");
        settingsTab.add(label3);

        navPane.addTab(
                "Medical Record", recordTab);
        navPane.addTab(
                "Appointments", apptTab);
        navPane.addTab(
                "Settings", settingsTab);

        frame.getContentPane()
                .add(navPane);
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

    private class PatientListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            String selectedName = (String) doctorList.getSelectedValue();
            System.out.println(selectedName);
        }

    }

}
