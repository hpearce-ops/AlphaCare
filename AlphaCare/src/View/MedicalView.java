/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MedicalController;
import Data.PatientArray;
import Data.RecordArray;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author david
 */
public class MedicalView extends AbstractView{

//    private final MedicalController medCntl;
    private JButton viewRecord;
    
    public MedicalView() {
        this.frame = new JFrame("Medical View");
        this.patients = new PatientArray();
        this.patientList = new JList<>(patients.getArrayNames());
        this.recordList = new RecordArray();
        this.image = new JLabel(); 

//        this.medCntl = medCntl;

    }
    
    @Override
    public void userSpecificUI() {
//        frame.getContentPane().add(patientList, BorderLayout.LINE_END);
       
        //make navigation tabs
        JTabbedPane navPane = new JTabbedPane();
        frame.getContentPane().add(navPane);
        ActionListener medRecListener = new MedicalRecordListener();
        
        //PATIENT TAB
        JPanel patientListTab = new JPanel();
        patientListTab.add(patientList);
        
        //APPOINTMENT TAB
        JPanel patientApptTab = new JPanel();
        JLabel label2 = new JLabel();
        label2.setText("Appointment List Here");
        patientApptTab.add(label2);
        
        //MEDICAL RECORD TAB
        JPanel medicalRecordTab = new JPanel();
       
        JPanel patientSelectPanel = new JPanel();
        patientSelectPanel.add(patientList);
        viewRecord = new JButton("View Record");
        viewRecord.addActionListener(medRecListener);
        patientSelectPanel.add(viewRecord);

        medicalRecordTab.add(patientSelectPanel, BorderLayout.NORTH);
        medicalRecordTab.add(image, BorderLayout.SOUTH); 
            
        //END OF TAB CODE
        navPane.addTab("Your Patients", patientListTab);
        navPane.addTab("Scheduled Appointments", patientApptTab);
        navPane.addTab("Medical Record", medicalRecordTab);
    }
    private class MedicalRecordListener implements ActionListener {
    //when patient is selected, user should be able to press button that will bring up record

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewRecord){
                Object selection = patientList.getSelectedValue();
                File file = recordList.findRecord((String) selection);
                System.out.println(file.getName()); 
                try {
                    BufferedImage img = ImageIO.read(file);
                    ImageIcon icon = new ImageIcon(img); 
                    image.setSize(500, 500);
                    image.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(MedicalView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
}