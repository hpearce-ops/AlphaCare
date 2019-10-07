/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medical;

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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of setMedicalPersonnel method, of class Login.
     */
    @Test
    public void testSetMedicalPersonnel() {
        System.out.println("setMedicalPersonnel");
        MedicalPersonnel medicalPersonnel = new MedicalPersonnel(null, null);
        Login instance = new Login(null);
        instance.setMedicalPersonnel(medicalPersonnel);
        System.out.println("Test passed");
    }

    /**
     * Test of getMedicalPersonnel method, of class Login.
     */
    @Test
    public void testGetMedicalPersonnel() {
        System.out.println("getMedicalPersonnel");
        Login instance = new Login(null);
        MedicalPersonnel expResult = null;
        MedicalPersonnel result = instance.getMedicalPersonnel();
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }

    /**
     * Test of authenticateUser method, of class Login.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        MedicalPersonnel medicalPersonnel = new MedicalPersonnel(null,null);
        Login instance = new Login(null);
        Boolean expResult = true;
        Boolean result = instance.authenticateUser(medicalPersonnel);
        assertEquals(expResult, result);
        System.out.println("Test passed");
    }
    
}
