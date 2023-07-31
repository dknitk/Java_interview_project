package com.interview;

import java.util.Arrays;
// Write a Java program to separate zeros from non-zeros in an integer array?
public class SeperateZerosFromNonZeros {
    public static void main(String[] args) {

        moveZerosInArray(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosInArray(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosInArray(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosInArray(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
    private static void moveZerosInArray(int[] arr){
        int counter = 0;

        for(int i = 0;i < arr.length; i++){
            if(arr[i] != 0){
                arr[counter] = arr[i];
                counter++;
            }
        }
        while(counter < arr.length){
            arr[counter++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
