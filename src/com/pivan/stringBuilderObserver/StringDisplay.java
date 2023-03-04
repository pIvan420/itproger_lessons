package com.pivan.stringBuilderObserver;

public class StringDisplay implements Observer{
    @Override
    public void update(String strBefore, String strNow) {
        System.out.println("Строка изменилась с: \"" + strBefore + "\"\nНа: \"" + strNow + "\"");
    }
}
