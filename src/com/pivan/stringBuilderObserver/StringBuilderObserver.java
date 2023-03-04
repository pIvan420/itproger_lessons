package com.pivan.stringBuilderObserver;

import java.util.ArrayList;

public class StringBuilderObserver implements Observable{
    private StringBuilder stringBuilder;

    private ArrayList<Observer> observers;

    public StringBuilderObserver(){
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String strBefore, String strNow) {
        for (Observer observer: observers){
            observer.update(strBefore, strNow);
        }
    }

    public void reverse(){
        String stringBefore = stringBuilder.toString();
        stringBuilder.reverse();
        notifyObservers(stringBefore, stringBuilder.toString());
    }

    public void append(String str){
        String stringBefore = stringBuilder.toString();
        stringBuilder.append(str);
        notifyObservers(stringBefore, stringBuilder.toString());
    }

    public void delete(int start, int end){
        String stringBefore = stringBuilder.toString();
        stringBuilder.delete(start, end);
        notifyObservers(stringBefore, stringBuilder.toString());
    }
}
