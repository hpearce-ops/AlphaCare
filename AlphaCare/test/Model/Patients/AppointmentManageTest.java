/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Patients;

import Model.Admin.Appointment;
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
        AppointmentManage instance = new AppointmentManage(new Appointment(null, null, null, null));
        Boolean expResult = true;
        Boolean result = instance.accept();
        assertEquals(expResult, result);
    }

    /**
     * Test of deny method, of class AppointmentManage.
     */
    @Test
    public void testDeny() {
        System.out.println("deny");
        AppointmentManage instance = new AppointmentManage(new Appointment(null, null, null, null));
        Boolean expResult = false;
        Boolean result = instance.deny();
        assertEquals(expResult, result);
    }
    
}
