package com.jakob.designpatterns.strategy;

/**
 * @author Jakob
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I can fly!");
    }
}
