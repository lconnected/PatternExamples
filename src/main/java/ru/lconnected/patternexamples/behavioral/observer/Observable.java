package ru.lconnected.patternexamples.behavioral.observer;

/**
 * Делает класс наблюдаемым
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public interface Observable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
