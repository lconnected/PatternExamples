package ru.lconnected.patternexamples.behavioral.observer;

import java.util.Date;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class WeatherDisplay implements Observer {

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private int pressure;

    public WeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("["+new Date()+"] Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст.\n", temperature, humidity, pressure);
    }

}
