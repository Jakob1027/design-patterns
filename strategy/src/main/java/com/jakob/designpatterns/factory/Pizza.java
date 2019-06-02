package com.jakob.designpatterns.factory;

import com.jakob.designpatterns.factory.ingredient.*;

/**
 * @author Jakob
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;


    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
