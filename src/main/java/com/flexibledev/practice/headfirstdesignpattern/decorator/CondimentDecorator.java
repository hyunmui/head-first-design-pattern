package com.flexibledev.practice.headfirstdesignpattern.decorator;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
