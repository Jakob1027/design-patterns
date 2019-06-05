package com.jakob.designpatterns.iterator;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenus() {
        System.out.println("Menu\n----\nBREAKFAST");
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
        printMenus(pancakeIterator);
        System.out.println("\nLUNCH");
        Iterator<MenuItem> dinerIterator = dinerMenu.iterator();
        printMenus(dinerIterator);
        System.out.println("\nDINNER");
        Iterator<MenuItem> cafeIterator = cafeMenu.iterator();
        printMenus(cafeIterator);
    }

    public void printMenus(Iterator<MenuItem> iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
