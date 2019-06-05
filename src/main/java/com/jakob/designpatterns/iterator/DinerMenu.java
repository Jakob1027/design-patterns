package com.jakob.designpatterns.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Hotdog", "A hotdog with saukraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            throw new IllegalStateException("菜单已满，无法再添加");
        } else {
            menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
        }
    }

    public int size() {
        return numberOfItems;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator();
    }

    private class DinerMenuIterator implements Iterator<MenuItem> {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < numberOfItems;
        }

        @Override
        public MenuItem next() {
            if (cursor >= numberOfItems || cursor >= menuItems.length) {
                throw new NoSuchElementException();
            }
            return menuItems[cursor++];
        }

        @Override
        public void remove() {
            if (cursor >= numberOfItems || cursor >= menuItems.length) {
                throw new IndexOutOfBoundsException();
            }
            if (cursor <= 0) {
                throw new IllegalStateException("菜单中没有元素，无法删除");
            }
            System.arraycopy(menuItems, cursor + 1, menuItems, cursor, numberOfItems - cursor - 1);
            menuItems[--numberOfItems] = null;
        }
    }
}
