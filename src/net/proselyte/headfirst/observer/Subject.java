package net.proselyte.headfirst.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notufyObservers();
}
