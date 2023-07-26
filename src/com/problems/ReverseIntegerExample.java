package com.problems;

public class ReverseIntegerExample {
    public static void main(String[] args) {
        System.out.println("Reverse a Integer");
        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(-3425));
    }

    static int reverseInteger(int x){
        int newValue = 0;
        while(x != 0 ){
            int mode = x % 10;
            newValue = newValue*10+mode;
            x = x/10;
        }
        return newValue;
    }
}
