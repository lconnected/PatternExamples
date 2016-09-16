package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Shape.Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Shape.Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Shape.Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
