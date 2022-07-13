package com.flexibledev.practice.headfirstdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flexibledev.practice.headfirstdesignpattern.decorator.InputTest;
import com.flexibledev.practice.headfirstdesignpattern.decorator.StarbuzzCoffee;
import com.flexibledev.practice.headfirstdesignpattern.observer.WeatherStation;

@SpringBootApplication
public class HeadFirstDesignPatternApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HeadFirstDesignPatternApplication.class, args);
		// WeatherStation.run();
		// StarbuzzCoffee.run();
		InputTest.run();
	}

}
