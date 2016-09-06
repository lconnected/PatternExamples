package ru.lconnected.patternexamples.creational.factory;

import java.io.File;
import java.io.OutputStream;

/**
 * Created by lkhruschev on 06.09.2016.
 */
public class WriterFactory {

    public AbstractWriter getWriter(Object target) {

        if(target instanceof File) {
            return new FileWriter();
        }

        if(target instanceof OutputStream) {
            return new StreamWriter();
        }

        throw new RuntimeException(target + " don't have a writer");

    }

}
