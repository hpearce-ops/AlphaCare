/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.AppointmentArray;
import Data.DoctorArray;
import Data.PatientArray;
import Data.RecordArray;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author henrypearce
 */
public class AbstractView {

    JFrame frame;
    PatientArray patients;
    DoctorArray doctors;
    AppointmentArray appointments;
    RecordArray recordList; 
    JList patientList;
    JList doctorList;
    JList appointmentList;
    UtilDateModel model;
    JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;
    JTextField timeField;
    JButton enter;
    JLabel image; 
    JLabel NAVIGATION;

    public AbstractView() {
        //leave initialization to specified classes
    }

    public void createdUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        userSpecificUI();
        frame.setVisible(true);
    }

    public void userSpecificUI() {
        //actions specific to patient, administrator, and medical can be placed here. 
    }

}
