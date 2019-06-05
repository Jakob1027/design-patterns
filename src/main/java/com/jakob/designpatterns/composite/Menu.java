package com.jakob.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> list = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return list.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName() + ", " + getDescription());
        System.out.println("----------------------------------------");

        for (MenuComponent menuComponent : list) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new CompositeIterator(list.iterator());
    }
}
