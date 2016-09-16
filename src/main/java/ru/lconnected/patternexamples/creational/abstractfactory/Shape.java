package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public interface Shape {

    String draw();

    class Rectangle implements Shape {

        @Override
        public String draw() {
            return "rectangle";
        }
    }

    class Square implements Shape {

        @Override
        public String draw() {
            return "square";
        }
    }

    class Circle implements Shape {

        @Override
        public String draw() {
            return "circle";
        }
    }

}


