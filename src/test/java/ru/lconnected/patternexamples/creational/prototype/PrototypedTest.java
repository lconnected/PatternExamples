/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lconnected.patternexamples.creational.prototype;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author machine
 */
public class PrototypedTest {
    
    public PrototypedTest() {
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
     * Test of clone method, of class Prototyped.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        Prototyped instance = new Prototyped(1, "Гусь");
        Object cloned = instance.clone();
        Prototyped nonEuqals = new Prototyped(2, "Povar");
        assertEquals(instance, cloned);
        assertNotEquals(instance, nonEuqals);
        assertNotEquals(cloned, nonEuqals);
        assertEquals(nonEuqals, nonEuqals.clone());
    }

    
}
