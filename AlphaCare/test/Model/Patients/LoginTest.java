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
     * Test of getPatient method, of class Login.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Login instance = new Login(null);
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatient method, of class Login.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Login instance = new Login(null);
        instance.setPatient(patient);
    }

    /**
     * Test of authenticateUser method, of class Login.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        Patient patient = new Patient(null,null);
        Login instance = new Login(new Patient(null,null));
        Boolean expResult = false;
        Boolean result = instance.authenticateUser(patient);
        assertEquals(expResult, result);
    }

}
