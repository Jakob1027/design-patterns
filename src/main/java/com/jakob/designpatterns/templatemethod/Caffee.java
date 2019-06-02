package com.jakob.designpatterns.templatemethod;

public class Caffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void hook() {
        System.out.println("I need to play a hook");
    }
}
