/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.DoctorArray;
import Data.PatientArray;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    DoctorArray medicalPersonell;
    JList medList;
    JList patientList;
    JList appointmentList; 
    UtilDateModel model;
    JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;
    JTextField timeField; 
    JButton enter; 
    
    public AbstractView() {
        //leave initialization to specified classes
    }
    
    public void createdUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        userSpecificUI(); 
        frame.setVisible(true);
    } 

    public void userSpecificUI() {
        //actions specific to patient, administrator, and medical can be placed here. 
    }
    
}
