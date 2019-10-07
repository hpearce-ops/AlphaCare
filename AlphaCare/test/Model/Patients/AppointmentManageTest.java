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
public class AppointmentManageTest {
    
    public AppointmentManageTest() {
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
     * Test of accept method, of class AppointmentManage.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        AppointmentManage instance = null;
        Boolean expResult = null;
        Boolean result = instance.accept();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deny method, of class AppointmentManage.
     */
    @Test
    public void testDeny() {
        System.out.println("deny");
        AppointmentManage instance = null;
        Boolean expResult = null;
        Boolean result = instance.deny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
