package com.flexibledev.practice.headfirstdesignpattern.factory;

import java.util.ArrayList;

import com.flexibledev.practice.headfirstdesignpattern.factory.ingredient.*;

public abstract class Pizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minuets at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
