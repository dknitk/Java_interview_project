package com.interview;

import java.util.Arrays;
// Write a Java program to reverse an array without using an additional array?
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 10};

        System.out.println("Original Array ::"+
                Arrays.toString(arr));

        System.out.println("Reveres Array ::"+
                Arrays.toString(reverseArray(arr)));

    }
    private static int[] reverseArray(int[] arr){
        int temp;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
