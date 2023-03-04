package com.pivan;
import com.pivan.exceptions_tasks.*;
import com.pivan.collections.*;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] {1};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(numbers);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
