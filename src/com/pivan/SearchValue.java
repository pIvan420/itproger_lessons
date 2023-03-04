package com.pivan;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchValue {
    public static String sortOutSearch(int[] arr, int value){
        Arrays.sort(arr);
        for(int elem: arr){
            if(elem == value){
                return "Элемент " + value + " входит в массив";
            }
        }
        return "Элемент " + value + " не входит в массив";
    }

    public static String binarySearch(int[] arr, int value){
        return binarySearch(arr, value, 0, arr.length);
    }

    private static String binarySearch(int[] arr, int value, int first, int last){
        int middle;
        Arrays.sort(arr);
        middle = (first + last) / 2;
        if(first > last)
            return "Такого числа нет в массиве";
        else if(arr[middle] == value){
            return "Число " + value + " есть в массиве";
        }
        else if(arr[middle] < value){
            return binarySearch(arr, value, middle + 1, last);
        }
        else if(arr[middle] > value){
            return binarySearch(arr, value, first, middle - 1);
        }
        else{
            return "Число " + value + " есть в массиве";
        }
    }
}
