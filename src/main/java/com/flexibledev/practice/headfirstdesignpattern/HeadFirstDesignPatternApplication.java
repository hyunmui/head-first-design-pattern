package com.flexibledev.practice.headfirstdesignpattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flexibledev.practice.headfirstdesignpattern.decorator.InputTest;
import com.flexibledev.practice.headfirstdesignpattern.decorator.StarbuzzCoffee;
import com.flexibledev.practice.headfirstdesignpattern.observer.WeatherStation;

@SpringBootApplication
public class HeadFirstDesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HeadFirstDesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// WeatherStation.run();
		// StarbuzzCoffee.run();
		InputTest.run();
	}

}
