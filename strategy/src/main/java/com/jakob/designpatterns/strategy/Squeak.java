package com.jakob.designpatterns.strategy;

/**
 * @author Jakob
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
