package com.jakob.designpatterns.factory;

/**
 * @author Jakob
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("clam");
    }
}
