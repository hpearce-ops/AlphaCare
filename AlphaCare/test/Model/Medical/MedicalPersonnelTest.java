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
        MedicalPersonnel instance = null;
        ArrayList<Patient> expResult = null;
        ArrayList<Patient> result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientList method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPatientList() {
        System.out.println("setPatientList");
        ArrayList<Patient> patientList = null;
        MedicalPersonnel instance = null;
        instance.setPatientList(patientList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonnelID method, of class MedicalPersonnel.
     */
    @Test
    public void testGetPersonnelID() {
        System.out.println("getPersonnelID");
        MedicalPersonnel instance = null;
        String expResult = "";
        String result = instance.getPersonnelID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonnelID method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPersonnelID() {
        System.out.println("setPersonnelID");
        String personnelID = "";
        MedicalPersonnel instance = null;
        instance.setPersonnelID(personnelID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassWord method, of class MedicalPersonnel.
     */
    @Test
    public void testGetPassWord() {
        System.out.println("getPassWord");
        MedicalPersonnel instance = null;
        String expResult = "";
        String result = instance.getPassWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassWord method, of class MedicalPersonnel.
     */
    @Test
    public void testSetPassWord() {
        System.out.println("setPassWord");
        String passWord = "";
        MedicalPersonnel instance = null;
        instance.setPassWord(passWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatient method, of class MedicalPersonnel.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient patient = null;
        MedicalPersonnel instance = null;
        instance.addPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
