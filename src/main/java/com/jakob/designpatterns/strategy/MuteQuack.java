package com.jakob.designpatterns.strategy;

/**
 * @author Jakob
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<Silence>");
    }
}
