package com.pivan.collections;

import java.util.Iterator;

public class Array2dIterator<E> implements Iterator<E>{

    private E[][] arr;
    private int index1 = 0;
    private int index2 = 0;

    Array2dIterator(E[][] arr){
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        for (int i = index1; i < arr.length; i++){
            for (int j = index2; j < arr[i].length; j++) return true;
        }
        return false;
    }

    @Override
    public E next() {
        if(!hasNext()){
            return null;
        }
        else{
            E el = arr[index1][index2];
            index2++;
            for(int i = index1; i < arr.length; i++){
                for(int j = (i == index1 ? index2 : 0); j < arr[i].length; j++){
                    index1 = i;
                    index2 = j;
                    return el;
                }
            }
            return el;
        }
    }
}
