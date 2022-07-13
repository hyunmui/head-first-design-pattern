package com.flexibledev.practice.headfirstdesignpattern.decorator.condiment;

import com.flexibledev.practice.headfirstdesignpattern.decorator.*;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

}
