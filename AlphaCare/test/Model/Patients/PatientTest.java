/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patients;

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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getPatientID method, of class Patient.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        Patient instance = new Patient("","");
        String expResult = "";
        String result = instance.getPatientID();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPatientID method, of class Patient.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String patientID = "";
        Patient instance = new Patient("","");
        instance.setPatientID(patientID);
        System.out.println("Test passed");
    }

    /**
     * Test of getPassWord method, of class Patient.
     */
    @Test
    public void testGetPassWord() {
        System.out.println("getPassWord");
        Patient instance = new Patient("","");
        String expResult = "";
        String result = instance.getPassWord();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPassWord method, of class Patient.
     */
    @Test
    public void testSetPassWord() {
        System.out.println("setPassWord");
        String passWord = "";
        Patient instance = new Patient("","");
        instance.setPassWord(passWord);
        System.out.println("Test passed");
    }
    
}
