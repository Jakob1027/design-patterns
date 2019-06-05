package com.jakob.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.iterator());
            }
            return menuComponent;
        } else {
            return null;
        }
//        Iterator<MenuComponent> iterator = stack.peek();
//        if (iterator.hasNext()) {
//            MenuComponent menuComponent = iterator.next();
//            if (menuComponent instanceof Menu) {
//                stack.push(menuComponent.iterator());
//            }
//            return menuComponent;
//        } else {
//            stack.pop();
//            return next();
//        }
    }
}
