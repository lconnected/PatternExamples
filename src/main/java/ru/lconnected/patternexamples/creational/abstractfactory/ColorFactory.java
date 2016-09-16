package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Color.Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Color.Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Color.Blue();
        }

        return null;
    }
}
