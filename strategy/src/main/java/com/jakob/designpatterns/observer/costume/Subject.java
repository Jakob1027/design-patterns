package com.jakob.designpatterns.observer.costume;

/**
 * @author Jakob
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
