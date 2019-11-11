/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Medical.MedicalPersonnel;
import java.util.ArrayList;

/**
 *
 * @author ajkow
 */
public class DoctorArray {

    ArrayList<MedicalPersonnel> medicalList;

    public DoctorArray() {
        this.medicalList = new ArrayList<>();
        fillDocList();
    }

    private void fillDocList() {
        medicalList.add(new MedicalPersonnel("John Smith", "Freddy12"));
        medicalList.add(new MedicalPersonnel("Floyd Collins", "FrKj563"));
        medicalList.add(new MedicalPersonnel("Demi Gawd", "G6F2"));
    }

    public String[] getArrayDocs() {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < medicalList.size(); i++) {
            nameList.add(medicalList.get(i).getPersonnelID());
        }
        String[] nameArray = nameList.toArray(new String[nameList.size()]);
        return nameArray;
    }

    public ArrayList getDocList() {
        return medicalList;
    }
}
