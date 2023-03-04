package com.pivan.exceptions_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateString {
    public static String createString(ArrayList<String> arr) throws IllegalArgumentException{
        if (arr == null) throw new IllegalArgumentException("Ошибка, массив пуст");
        if (arr.isEmpty()) throw new IllegalArgumentException("Ошибка, массив пуст");
        String str = String.join(", ", arr);
        return str;
    }
}
