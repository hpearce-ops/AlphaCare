/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.AppointmentArray;
import Data.DoctorArray;
import Data.PatientApptArray;
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

    protected JFrame frame;
    protected PatientArray patients;
    protected DoctorArray doctors;
    protected AppointmentArray appointments;
    protected PatientApptArray patientAppts; 
    protected RecordArray recordList; 
    protected JList patientList;
    protected JList doctorList;
    protected JList appointmentList;
    protected UtilDateModel model;
    protected JDatePanelImpl datePanel;
    protected JDatePickerImpl datePicker;
    protected JTextField timeField;
    protected JButton enter;
    protected JLabel NAVIGATION;
    protected JLabel image;

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
