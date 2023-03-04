package com.pivan;

public class Conditions implements Runnable{


    @Override
    public void run() {
        System.out.println("Начинаем поток...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
        System.out.println("Заканчиваем поток...");
    }
}
