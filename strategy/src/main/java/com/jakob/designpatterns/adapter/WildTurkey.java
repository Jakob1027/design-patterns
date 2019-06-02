package com.jakob.designpatterns.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Wild turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey fly");
    }
}
