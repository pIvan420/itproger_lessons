package com.pivan.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class CheckArrayTime {
    public static void CheckTime(){
        final int M = 1000000;
        final int N = 1000;
        ArrayList<Double> arr1 = new ArrayList<>();
        LinkedList<Double> arr2 = new LinkedList<>();
        for (int i = 0; i < M; i++){
            arr1.add(Math.random());
            arr2.add(Math.random());
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++){
            arr1.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++){
            arr2.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
