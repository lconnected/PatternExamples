package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
