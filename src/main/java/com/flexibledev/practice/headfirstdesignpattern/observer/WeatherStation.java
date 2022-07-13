package com.flexibledev.practice.headfirstdesignpattern.observer;

import com.flexibledev.practice.headfirstdesignpattern.observer.display.CurrentConditionsDisplay;
import com.flexibledev.practice.headfirstdesignpattern.observer.display.ForecastDisplay;
import com.flexibledev.practice.headfirstdesignpattern.observer.display.StatisticsDisplay;

public class WeatherStation {
    public static void run() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
