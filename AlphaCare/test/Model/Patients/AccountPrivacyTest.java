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
public class AccountPrivacyTest {
    
    public AccountPrivacyTest() {
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
     * Test of getAccountID method, of class AccountPrivacy.
     */
    @Test
    public void testGetAccountID() {
        System.out.println("getAccountID");
        AccountPrivacy instance = null;
        String expResult = "";
        String result = instance.getAccountID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountID method, of class AccountPrivacy.
     */
    @Test
    public void testSetAccountID() {
        System.out.println("setAccountID");
        String accountID = "";
        AccountPrivacy instance = null;
        instance.setAccountID(accountID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyID method, of class AccountPrivacy.
     */
    @Test
    public void testVerifyID() {
        System.out.println("verifyID");
        String accountID = "";
        AccountPrivacy instance = null;
        Boolean expResult = null;
        Boolean result = instance.verifyID(accountID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removedAddition method, of class AccountPrivacy.
     */
    @Test
    public void testRemovedAddition() {
        System.out.println("removedAddition");
        String accountID = "";
        AccountPrivacy instance = null;
        instance.removedAddition(accountID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of approveAddition method, of class AccountPrivacy.
     */
    @Test
    public void testApproveAddition() {
        System.out.println("approveAddition");
        String accountID = "";
        AccountPrivacy instance = null;
        instance.approveAddition(accountID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
