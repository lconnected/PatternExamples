package ru.lconnected.patternexamples.behavioral.observer;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class TemperatureConverter implements Observer {

    private WeatherData weatherData;

    public TemperatureConverter(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        System.out.println("[Temperature in fahrenheit] - " + convert(temperature));
    }

    private float convert(float temperature) {
        return temperature * (9/5) + 32;
    }

}
