/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefa
 */
public class calcuTest {
    
    public calcuTest() {
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
     * Test of suma method, of class calcu.
     */
    @org.junit.Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        calcu instance = new calcu();
        int expResult = 0;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class calcu.
     */
    @org.junit.Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        calcu instance = new calcu();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multi method, of class calcu.
     */
    @org.junit.Test
    public void testMulti() {
        System.out.println("multi");
        int a = 0;
        int b = 0;
        calcu instance = new calcu();
        int expResult = 0;
        int result = instance.multi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divi method, of class calcu.
     */
    @org.junit.Test
    public void testDivi() {
        System.out.println("divi");
        int a = 3;
        int b = 3;
        calcu instance = new calcu();
        int expResult = 1;
        int result = instance.divi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
