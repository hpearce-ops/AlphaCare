/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.PatientArray;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author david
 */
public class MedicalView extends AbstractView {

    public MedicalView() {
        this.frame = new JFrame("Medical View");
        this.patients = new PatientArray();
        this.patientList = new JList<>(patients.getArrayNames());
    }
    
    @Override
    public void userSpecificUI() {
        frame.getContentPane().add(patientList, BorderLayout.LINE_END);
    }

}