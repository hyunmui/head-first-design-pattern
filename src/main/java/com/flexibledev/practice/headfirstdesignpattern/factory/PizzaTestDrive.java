package com.flexibledev.practice.headfirstdesignpattern.factory;

public class PizzaTestDrive {
    public static void run() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoStore.createPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");
    }
}
