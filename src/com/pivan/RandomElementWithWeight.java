package com.pivan;

import java.util.Arrays;

public class RandomElementWithWeight {

    private int[] valuesArray;
    private int[] weightArray;
    private int[] ranges;
    private int sum;
    public RandomElementWithWeight(int[] valuesArray, int[] weightArray){
        this.valuesArray = valuesArray;
        this.weightArray = weightArray;
        ranges = new int[valuesArray.length];
        sum = 0;
        for(int weight: weightArray){
            sum += weight;
        }

        int lastSum = 0;
        for(int i = 0; i < ranges.length; i++){
            ranges[i] = lastSum;
            lastSum += weightArray[i];
        }
    }

    public int randomValues(){
        int random = (int) (Math.random() * (sum - 1));

//        int ourRangeIndex = 0;
//        for(int i = 0; i < ranges.length; i++){
//            if(ranges[i] > random)
//                break;
//            ourRangeIndex = i;
//        }
        int index = Arrays.binarySearch(ranges, random);
        return valuesArray[index >= 0 ? index : -index - 2];
    }
}
