package com.jakob.designpatterns.observer.costom;

/**
 * @author Jakob
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
