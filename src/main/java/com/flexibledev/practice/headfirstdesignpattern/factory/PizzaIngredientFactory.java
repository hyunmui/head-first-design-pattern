package com.flexibledev.practice.headfirstdesignpattern.factory;

import com.flexibledev.practice.headfirstdesignpattern.factory.ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVaggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
