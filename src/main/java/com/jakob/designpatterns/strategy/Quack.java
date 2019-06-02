package com.jakob.designpatterns.strategy;

/**
 * @author Jakob
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
