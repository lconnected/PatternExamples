package ru.lconnected.patternexamples.creational.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by lconnected on 16.09.16.
 */
public class AbstractFactoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetColor() throws Exception {


        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call getColor method of Red
        assertEquals(color1.getColor(), "red");

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call getColor method of Green
        assertEquals(color2.getColor(), "green");

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call getColor method of Color Blue
        assertEquals(color3.getColor(), "blue");
    }

    @Test
    public void testGetShape() throws Exception {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        assertEquals(shape1.draw(), "circle");

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        assertEquals(shape2.draw(), "rectangle");

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        assertEquals(shape3.draw(), "square");
    }

}