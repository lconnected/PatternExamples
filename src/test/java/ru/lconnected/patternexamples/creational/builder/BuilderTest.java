package ru.lconnected.patternexamples.creational.builder;

import org.junit.*;
import static org.junit.Assert.*;
import ru.lconnected.patternexamples.creational.builder.*;

/**
 * Created by lkhruschev on 06.09.2016.
 */
public class BuilderTest {


    public BuilderTest() {
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
    public void testBuilder() {
        System.out.println("test Builder");
        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
        Director director = new Director();
        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();
        Computer compOne = director.getComputer();
        Computer compTwo = director.getComputer();
        System.out.println(compOne.toString());
        System.out.println(compTwo.toString());
        assertNotNull(compOne);
        assertNotNull(compTwo);
        assertEquals(compOne, compTwo);
    }

}
