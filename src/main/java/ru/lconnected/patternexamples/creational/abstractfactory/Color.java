package ru.lconnected.patternexamples.creational.abstractfactory;

/**
 * Created by lconnected on 16.09.16.
 */
public interface Color {

    String getColor();

    public class Red implements Color {

        @Override
        public String getColor() {
            return "red";
        }
    }

    public class Green implements Color {

        @Override
        public String getColor() {
            return "green";
        }
    }

    public class Blue implements Color {

        @Override
        public String getColor() {
            return "blue";
        }
    }

}

