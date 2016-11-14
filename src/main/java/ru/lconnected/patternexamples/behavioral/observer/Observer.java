package ru.lconnected.patternexamples.behavioral.observer;

/**
 * Описывает поведения наблюдателя, в данном случае для класса WeatherData
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public interface Observer {

    void update(float temperature, float humidity, int pressure);

}