/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Medical.MedicalPersonnel;
import Model.Patients.Patient;
import java.time.LocalTime;
import java.util.Date;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        Date expResult = new Date();
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        instance.setDate(date);
    }

    /**
     * Test of getTime method, of class Appointment.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        LocalTime expResult = time;
        LocalTime result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTime method, of class Appointment.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        LocalTime time = null;
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        instance.setTime(time);
    }

    /**
     * Test of getPatient method, of class Appointment.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(null, new MedicalPersonnel("",""), new Date(), time);
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatient method, of class Appointment.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        instance.setPatient(patient);
    }

    /**
     * Test of getMedicalPersonnel method, of class Appointment.
     */
    @Test
    public void testGetMedicalPersonnel() {
        System.out.println("getMedicalPersonnel");
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), null, new Date(), time);
        MedicalPersonnel expResult = null;
        MedicalPersonnel result = instance.getMedicalPersonnel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMedicalPersonnel method, of class Appointment.
     */
    @Test
    public void testSetMedicalPersonnel() {
        System.out.println("setMedicalPersonnel");
        MedicalPersonnel medicalPersonnel = null;
        LocalTime time = LocalTime.of(1, 1,1,1);
        Appointment instance = new Appointment(new Patient("",""), new MedicalPersonnel("",""), new Date(), time);
        instance.setMedicalPersonnel(medicalPersonnel);
    }
    
}
