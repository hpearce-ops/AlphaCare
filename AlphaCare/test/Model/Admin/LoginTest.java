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
        Login instance = new Login(null);
        Admin expResult = null;
        Admin result = instance.getAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdmin method, of class Login.
     */
    @Test
    public void testSetAdmin() {
        System.out.println("setAdmin");
        Admin admin = null;
        Login instance = new Login(null);
        instance.setAdmin(admin);
    }

    /**
     * Test of authenticateUser method, of class Login.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        Admin admin = null;
        Login instance = new Login(null);
        Boolean expResult = true;
        Boolean result = instance.authenticateUser(admin);
        assertEquals(expResult, result);;
    }
    
}
