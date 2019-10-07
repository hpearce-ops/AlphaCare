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
        MedicalPrivacy instance = new MedicalPrivacy(null);
        Boolean[] expResult = null;
        Boolean[] result = instance.getMedicalPersonnel();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setMedicalPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testSetMedicalPersonnel() {
        System.out.println("setMedicalPersonnel");
        Boolean[] medicalPersonnel = null;
        MedicalPrivacy instance = new MedicalPrivacy(null);
        instance.setMedicalPersonnel(medicalPersonnel);
    }

    /**
     * Test of denyAllPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testDenyAllPersonnel() {
        System.out.println("denyAllPersonnel");
        Boolean[] boolArr = new Boolean[3];
        boolArr[0] = true;
        boolArr[1] = false;
        boolArr[2] = true;
        MedicalPrivacy instance = new MedicalPrivacy(boolArr);
        instance.denyAllPersonnel();
    }

    /**
     * Test of allowAllPersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testAllowAllPersonnel() {
        System.out.println("allowAllPersonnel");
        Boolean[] boolArr = new Boolean[3];
        boolArr[0] = true;
        boolArr[1] = false;
        boolArr[2] = true;
        MedicalPrivacy instance = new MedicalPrivacy(boolArr);
        instance.allowAllPersonnel();
    }

    /**
     * Test of togglePersonnel method, of class MedicalPrivacy.
     */
    @Test
    public void testTogglePersonnel() {
        System.out.println("togglePersonnel");
        Boolean[] array = new Boolean[3];
        array[0] = true;
        array[1] = true;
        array[2] = true;
        MedicalPrivacy instance = new MedicalPrivacy(array);
        Boolean[] expResult = new Boolean [3];
        expResult[0] = true;
        expResult[1] = true;
        expResult[2] = true;
        Boolean[] result = instance.togglePersonnel(array);
        assertArrayEquals(expResult, result);
    }
    
}
