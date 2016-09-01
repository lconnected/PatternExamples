/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lconnected.patternexamples.singleton;

import ru.lconnected.patternexamples.creational.singleton.Singleton;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SingletonTest {
    
    public SingletonTest() {
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
     * Test of getInstance method, of class Singleton.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        for(int i = 0; i < 100; i++) {
            System.out.println("i="+i+": ");
            new Thread( () -> {
                System.out.print(Singleton.getInstance().getCreated());
            }).start();
        }
        assertNotNull(Singleton.getInstance());
    }
    
}
