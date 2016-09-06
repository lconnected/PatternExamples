package ru.lconnected.patternexamples.creational.factory;

import org.junit.Test;

import java.io.File;
import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by lkhruschev on 06.09.2016.
 */
public class WriterFactoryTest {

    @Test
    public void testGetWriter() throws Exception {

        WriterFactory factory = new WriterFactory();

        File file = new File("");

        AbstractWriter writerOne = factory.getWriter(file);
        AbstractWriter writerTwo = factory.getWriter(System.out);

        System.out.println("type one: " + writerOne.getType());
        System.out.println("type two: " + writerTwo.getType());

        writerOne.write("text", file);
        writerTwo.write("text", System.out);

        assertNotNull(writerOne);
        assertNotNull(writerTwo);
        assertNotEquals(writerOne.getType(), writerTwo.getType());

    }
}