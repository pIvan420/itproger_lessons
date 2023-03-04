package com.pivan.collections;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private E[] arr;
    private int index = 0;
    public ArrayIterator(E[] arr){
        this.arr = arr;
    }


    @Override
    public boolean hasNext() {
        return arr.length > index;
    }

    @Override
    public E next() {
        if (hasNext()){
            return arr[index++];
        }
        else return null;
    }
}
