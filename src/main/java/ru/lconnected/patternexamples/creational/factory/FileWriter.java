package ru.lconnected.patternexamples.creational.factory;

public class FileWriter extends AbstractWriter {

    public FileWriter() {
        this.type = "FileWriter";
    }

    @Override
    public void write(Object objToWrite, Object target) {
        System.out.println("Writing " + objToWrite + " to file " + target);
    }

}

