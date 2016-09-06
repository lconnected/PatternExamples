package ru.lconnected.patternexamples.creational.factory;

public class StreamWriter extends AbstractWriter {

    public StreamWriter() {
        this.type = "StreamWriter";
    }

    @Override
    public void write(Object objToWrite, Object target) {
        System.out.println("Writing " + objToWrite + " to stream " + target);
    }

}
