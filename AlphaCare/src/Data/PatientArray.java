/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author henrypearce
 */
public class PatientArray {

    ArrayList<Patient> patientList;

    public PatientArray() {
        this.patientList = new ArrayList<>();
        populateArray();
    }

    private void populateArray() {
        patientList.add(new Patient("John Doe", "12345678", "password1"));
        patientList.add(new Patient("Jane Doe", "87654321", "password2"));
        patientList.add(new Patient("Robert Redford", "55555555", "password3"));
        patientList.add(new Patient("Alice Wonderland", "89898989", "password4"));
    }

    public String[] getArrayNames() {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < patientList.size(); i++) {
            nameList.add(patientList.get(i).getPatientName());
        }
        String[] nameArray = nameList.toArray(new String[nameList.size()]);
        return nameArray;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public Patient findPatient(String patName) {
        Patient temp = null;
        for (int i = 0; i < patientList.size(); i++) {
            if (patName.equals(patientList.get(i).getPatientName())) {
                temp = patientList.get(i);
            }
        }
        return temp;
    }

}
