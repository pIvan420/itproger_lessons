package com.pivan;

public class FindSqrt {
    private static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 354.3 * x - 23;
    }

    public static double solve(double start, double end){
        if(end - start <= 0.001){
            return start;
        }

        double x = start + (end - start) / 2;

        if(func(start) * func(x) > 0){
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }

//    public static double solve(double start, double end){
//
//        return 3.5;
//    }

}
