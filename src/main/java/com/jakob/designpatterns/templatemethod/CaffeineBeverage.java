package com.jakob.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void hook() {
    }
}
