package com.jakob.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Jakob
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees " + humidity + "% humidity");
    }
}
