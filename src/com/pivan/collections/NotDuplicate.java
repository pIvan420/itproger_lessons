package com.pivan.collections;

import java.util.Collection;
import java.util.HashSet;

public class NotDuplicate {
    public static <E> Collection<E> DeleteDuplicate(Collection<E> col){
        return new HashSet<>(col);
    }
}
