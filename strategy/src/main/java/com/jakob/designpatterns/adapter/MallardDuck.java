package com.jakob.designpatterns.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard duck quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck fly");
    }
}
