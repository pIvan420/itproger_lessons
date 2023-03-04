package com.pivan;

public class NewList<T> {
    private int size = 0;
    private Entry<T> header;

    public NewList(){
        header = null;
    }

    public void add(T element){
        Entry<T> newEntry = new Entry<T>(element);
        Entry<T> curEntry = header;
        if(header == null){
            header = newEntry;
        } else {
            while (curEntry.next != null){
                curEntry = curEntry.next;
            }
            curEntry.next = newEntry;
        }
        size++;
    }

    public T get(int id){
        Entry<T> findEntry = header;
        for(int i = 0; i < id; i++){
            findEntry = findEntry.next;
        }
        return findEntry.element;
    }

    private static class Entry<T>{
        T element;
        Entry<T> next;

        Entry(T element){
            this.element = element;
            this.next = null;
        }

    }

}
