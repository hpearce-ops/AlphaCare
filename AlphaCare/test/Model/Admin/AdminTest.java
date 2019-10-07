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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of getAdminId method, of class Admin.
     */
    @Test
    public void testGetAdminId() {
        System.out.println("getAdminId");
        Admin instance = new Admin("","");
        String expResult = "";
        String result = instance.getAdminId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdminId method, of class Admin.
     */
    @Test
    public void testSetAdminId() {
        System.out.println("setAdminId");
        String adminId = "";
        Admin instance = new Admin("","");
        instance.setAdminId(adminId);
    }

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = new Admin("","");
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Admin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Admin instance = new Admin("","");
        instance.setPassword(password);
    }
    
}
