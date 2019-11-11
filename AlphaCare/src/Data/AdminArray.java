/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Admin.Admin;
import java.util.ArrayList;

/**
 *
 * @author ajkow
 */
public class AdminArray {
    ArrayList<Admin> adminList;
    public AdminArray(){
        this.adminList = new ArrayList<>();
        populateArray();
    }
    private void populateArray() {
        adminList.add(new Admin("John Johnson", "BeansRgud"));
        adminList.add(new Admin("Doe Jane", "Max123Foe"));
        adminList.add(new Admin("Inur Carr", "69did"));
        adminList.add(new Admin("Outi Side", "nothingWrong69"));
    }

    public String[] getArrayNames() {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < adminList.size(); i++) {
            nameList.add(adminList.get(i).getAdminId());
        }
        String[] nameArray = nameList.toArray(new String[nameList.size()]);
        return nameArray;
    }

    public ArrayList<Admin> getPatientList() {
        return adminList;
    }
}
