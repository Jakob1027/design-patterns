package com.jakob.designpatterns.strategy;

/**
 * @author Jakob
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Green head");
    }
}
