package com.pivan.exceptions_tasks;

public class Division {

    public static int divide(int a, int b){
        int c;
        try{
            c = a / b;
            return c;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }


}
