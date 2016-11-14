package ru.lconnected.patternexamples.behavioral.observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Демонстрирует как классы WeatherDisplay и TemperatureConverter реагирую на события,
 * происходящие в классе WeatherData
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class ObserverTest {

    private WeatherData weatherData;
    private WeatherDisplay weatherDisplay;
    private TemperatureConverter temperatureConverter;

    @Before
    public void setUp() {
        weatherData = new WeatherData();
        weatherDisplay = new WeatherDisplay(weatherData);
        temperatureConverter = new TemperatureConverter(weatherData);
    }

    @Test
    public void testUpdate() throws Exception {
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}