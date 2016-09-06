package ru.lconnected.patternexamples.creational.factory;

/**
 * Created by lkhruschev on 06.09.2016.
 */
public abstract class AbstractWriter {

    protected String type;

    public AbstractWriter() {
        this.type = "undefined";
    }

    public abstract void write(Object objToWrite, Object target);

    public String getType() {
        return type;
    }
}

