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
public class MedicalPrivacyTest {
    
    public MedicalPrivacyTest() {
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
     * Test of getMedicalPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testGetMedicalPersonnel() {
        System.out.println("getMedicalPersonnel");
        MedicalPrivacy instance = null;
        Boolean[] expResult = null;
        Boolean[] result = instance.getMedicalPersonnel();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicalPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testSetMedicalPersonnel() {
        System.out.println("setMedicalPersonnel");
        Boolean[] medicalPersonnel = null;
        MedicalPrivacy instance = null;
        instance.setMedicalPersonnel(medicalPersonnel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of denyAllPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testDenyAllPersonnel() {
        System.out.println("denyAllPersonnel");
        MedicalPrivacy instance = null;
        instance.denyAllPersonnel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowAllPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testAllowAllPersonnel() {
        System.out.println("allowAllPersonnel");
        MedicalPrivacy instance = null;
        instance.allowAllPersonnel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of togglePersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testTogglePersonnel() {
        System.out.println("togglePersonnel");
        Boolean[] array = null;
        MedicalPrivacy instance = null;
        Boolean[] expResult = null;
        Boolean[] result = instance.togglePersonnel(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
