/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Patients.MedicalRecord;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author henrypearce
 */
public class RecordArray {

    private final ArrayList<MedicalRecord> recordList;
    private final PatientArray patient;

    public RecordArray() {
        this.recordList = new ArrayList<>();
        this.patient = new PatientArray();
        populateArray();
    }

    private void populateArray() {
        for (int i = 0; i < patient.getPatientList().size(); i++) {
            recordList.add(new MedicalRecord(patient.getPatientList().get(i).getPatientID(), patient.getPatientList().get(i).getPatientName()));
            File file = new File("./MedicalRecords/download.png");
            recordList.get(i).uploadMedicalRecord(file);
            System.out.println(recordList.get(i).getMedicalRecords().getAbsolutePath());
        }
    }

    public File findRecord(String name) {
        File temp = null;
        for (int i = 0; i < recordList.size(); i++) {
            if (name.equals(recordList.get(i).getName())) {
                temp = recordList.get(i).getMedicalRecords();
            }
        }
        return temp;
    }

}
