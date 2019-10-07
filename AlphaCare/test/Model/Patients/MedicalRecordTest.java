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
        MedicalRecord instance = new MedicalRecord("","");
        String expResult = "";
        String result = instance.getPatientID();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setPatientID method, of class MedicalRecord.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String patientID = "";
        MedicalRecord instance = new MedicalRecord("","");
        instance.setPatientID(patientID);
        System.out.println("Test passed");
    }

    /**
     * Test of getName method, of class MedicalRecord.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MedicalRecord instance = new MedicalRecord("","");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setName method, of class MedicalRecord.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MedicalRecord instance = new MedicalRecord("","");
        instance.setName(name);
        System.out.println("Test passed");
    }

    /**
     * Test of getMedicalRecords method, of class MedicalRecord.
     */
    @Test
    public void testGetMedicalRecords() {
        System.out.println("getMedicalRecords");
        MedicalRecord instance = new MedicalRecord("","");
        File expResult = null;
        File result = instance.getMedicalRecords();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of setMedicalRecords method, of class MedicalRecord.
     */
    @Test
    public void testSetMedicalRecords() {
        System.out.println("setMedicalRecords");
        File MedicalRecords = null;
        MedicalRecord instance = new MedicalRecord("","");
        instance.setMedicalRecords(MedicalRecords);
        System.out.println("Test passed");
    }

    /**
     * Test of uploadMedicalRecord method, of class MedicalRecord.
     */
    @Test
    public void testUploadMedicalRecord() {
        System.out.println("uploadMedicalRecord");
        File file = null;
        MedicalRecord instance = new MedicalRecord("","");
        instance.uploadMedicalRecord(file);
        System.out.println("Test passed");
    }

    /**
     * Test of deleteMedicalRecord method, of class MedicalRecord.
     */
    @Test
    public void testDeleteMedicalRecord() {
        System.out.println("deleteMedicalRecord");
        MedicalRecord instance = new MedicalRecord("","");
        instance.deleteMedicalRecord();
        System.out.println("Test passed");
    }
    
}
