/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.Percent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author insset
 */
public class PercentTest {
    
    public PercentTest() {
        //given
        int n = 4;
        int nb = 2;
        Percent instance = new Percent();
        String expResult = "Le résultat de la division est 2 et le reste : 0";

        //when
        String result = instance.Divider(nb,n);

        //then
        Assert.assertEquals(expResult, result);
        System.out.println(result);    }
    
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
