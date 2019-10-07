/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

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
     * Test of getAdmin method, of class Login.
     */
    @Test
    public void testGetAdmin() {
        System.out.println("getAdmin");
        Login instance = null;
        Admin expResult = null;
        Admin result = instance.getAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdmin method, of class Login.
     */
    @Test
    public void testSetAdmin() {
        System.out.println("setAdmin");
        Admin admin = null;
        Login instance = null;
        instance.setAdmin(admin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticateUser method, of class Login.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        Admin admin = null;
        Login instance = null;
        Boolean expResult = null;
        Boolean result = instance.authenticateUser(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
