/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patients;

import java.io.File;
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
public class MedicalRecordTest {
    
    public MedicalRecordTest() {
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
     * Test of getPatientID method, of class MedicalRecord.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        MedicalRecord instance = null;
        String expResult = "";
        String result = instance.getPatientID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientID method, of class MedicalRecord.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String patientID = "";
        MedicalRecord instance = null;
        instance.setPatientID(patientID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class MedicalRecord.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MedicalRecord instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class MedicalRecord.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MedicalRecord instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalRecords method, of class MedicalRecord.
     */
    @Test
    public void testGetMedicalRecords() {
        System.out.println("getMedicalRecords");
        MedicalRecord instance = null;
        File expResult = null;
        File result = instance.getMedicalRecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicalRecords method, of class MedicalRecord.
     */
    @Test
    public void testSetMedicalRecords() {
        System.out.println("setMedicalRecords");
        File MedicalRecords = null;
        MedicalRecord instance = null;
        instance.setMedicalRecords(MedicalRecords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uploadMedicalRecord method, of class MedicalRecord.
     */
    @Test
    public void testUploadMedicalRecord() {
        System.out.println("uploadMedicalRecord");
        File file = null;
        MedicalRecord instance = null;
        instance.uploadMedicalRecord(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedicalRecord method, of class MedicalRecord.
     */
    @Test
    public void testDeleteMedicalRecord() {
        System.out.println("deleteMedicalRecord");
        MedicalRecord instance = null;
        instance.deleteMedicalRecord();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
