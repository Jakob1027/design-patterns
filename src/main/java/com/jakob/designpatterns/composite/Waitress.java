package com.jakob.designpatterns.composite;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenus() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\nVegetarian Menu\n----------------------------");
        Iterator<MenuComponent> iterator = allMenus.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            try {
                if (next.isVegetarian()) {
                    next.print();
                }
            } catch (UnsupportedOperationException ignored) {

            }
        }
    }
}
