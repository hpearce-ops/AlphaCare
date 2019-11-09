/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medical;

import Model.Patients.Patient;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class MedicalPersonnelTest {
    
    public MedicalPersonnelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPatient method, of class MedicalPersonnel.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        MedicalPersonnel instance = new MedicalPersonnel(null,null);
        ArrayList<Patient> expResult = new ArrayList<>();
        ArrayList<Patient> result = instance.getPatient();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPatientList method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPatientList() {
        System.out.println("setPatientList");
        ArrayList<Patient> patientList = new ArrayList<>();
        MedicalPersonnel instance = new MedicalPersonnel(null, null);
        instance.setPatientList(patientList);
        System.out.println("Test passed");
    }

    /**
     * Test of getPersonnelID method, of class MedicalPersonnel.
     */
    @Test
    public void testGetPersonnelID() {
        System.out.println("getPersonnelID");
        MedicalPersonnel instance = new MedicalPersonnel("","");
        String expResult = "";
        String result = instance.getPersonnelID();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPersonnelID method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPersonnelID() {
        System.out.println("setPersonnelID");
        String personnelID = "";
        MedicalPersonnel instance = new MedicalPersonnel("","");
        instance.setPersonnelID(personnelID);
        System.out.println("Test passed");
    }

    /**
     * Test of getPassWord method, of class MedicalPersonnel.
     */
    @Test
    public void testGetPassWord() {
        System.out.println("getPassWord");
        MedicalPersonnel instance = new MedicalPersonnel("","");
        String expResult = "";
        String result = instance.getPassWord();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPassWord method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPassWord() {
        System.out.println("setPassWord");
        String passWord = "";
        MedicalPersonnel instance = new MedicalPersonnel("","");
        instance.setPassWord(passWord);
        System.out.println("Test passed");
    }

    /**
     * Test of addPatient method, of class MedicalPersonnel.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient patient = new Patient(null,null,null);
        MedicalPersonnel instance = new MedicalPersonnel(null, null);
        instance.addPatient(patient);
        System.out.println("Test passed");
    }
    
}
