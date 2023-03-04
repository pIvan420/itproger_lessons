package com.pivan;

import java.util.ArrayList;
import java.util.Arrays;

public class MyFilter<T>{

    private T[] arr;

    public MyFilter(T[] arr){
        this.arr = arr;
    }

    public T[] filter(Filter filter){
        int offset = 0;
        for(int i = 0; i < arr.length; i++){
            if(!filter.apply(arr[i])){
                offset++;
            }
            else{
                arr[i - offset] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - offset);
    }
}

interface Filter<T>{
    boolean apply(T o);
}
