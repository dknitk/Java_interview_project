package com.javabasic.exception;

public class GFG {

    static int divideByZero(int a, int b){
        int i = a / b;
        return i;
    }
    static int computerDivision(int a, int b){
        int res = 0;
        try{
            res = divideByZero(a, b);
        }catch (NumberFormatException ex){
            System.out.println("NumberFormatException is occurred...");
        }
        return res;
    }

    public static void main(String[] args){
        int a = 1;
        int b = 0;

        try{
            int i = computerDivision(a, b);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
