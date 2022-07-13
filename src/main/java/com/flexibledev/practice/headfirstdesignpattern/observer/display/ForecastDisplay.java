package com.flexibledev.practice.headfirstdesignpattern.observer.display;

import com.flexibledev.practice.headfirstdesignpattern.observer.DisplayElement;
import com.flexibledev.practice.headfirstdesignpattern.observer.Observer;
import com.flexibledev.practice.headfirstdesignpattern.observer.Subject;

public class ForecastDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
