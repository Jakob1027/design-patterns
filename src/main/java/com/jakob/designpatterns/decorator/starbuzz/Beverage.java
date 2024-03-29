package com.jakob.designpatterns.decorator.starbuzz;

/**
 * @author Jakob
 */
public abstract class Beverage {
    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;

    String description = "Unknown Beverage";
    private int size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

