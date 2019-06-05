package com.jakob.designpatterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Soup of the day", "A cup of the soup of the day,with a side salad", false, 3.69);
        addItem("Burrito", "A cup of the soup of the day,with a side salad", false, 3.69);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.values().iterator();
    }
}
