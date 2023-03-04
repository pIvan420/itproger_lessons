package com.pivan.stringBuilderObserver;

public interface Observable {
    void registerObservers(Observer o);
    void removeObservers(Observer o);
    void notifyObservers(String strBefore, String strNow);
}
