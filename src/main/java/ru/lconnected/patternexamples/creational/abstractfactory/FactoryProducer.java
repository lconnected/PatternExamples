package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
