package com.interview;

import java.util.Arrays;

public class MinAbsoluteNumber {
    public static void main(String[] args) {
        findMinAbsoluteDifference(new int[] {5, 8, 4, 2, 9, 0});

        System.out.println("==========================");

        findMinAbsoluteDifference(new int[] {45, -89, 12, -62, 31, -57});

        System.out.println("==========================");

        findMinAbsoluteDifference(new int[] {5, -3, 7, -2});
    }
    private static void findMinAbsoluteDifference(int[] arr){
        Arrays.sort(arr);

        int min = Math.abs(arr[1] - arr[0]);
        int firstEle = arr[0];
        int secondEle = arr[1];
        for(int i = 2; i<arr.length; i++){
            if(Math.abs(arr[i] - arr[i - 1]) < min){
                min = Math.abs(arr[i] - arr[i - 1]);
                firstEle = arr[i-1];
                secondEle = arr[i];
            }
        }
        System.out.println("Sorted Array ::" + Arrays.toString(arr));
        System.out.println("Min Absolute Difference :: "+ min);
        System.out.println("Pair of Elements : (" + firstEle + " , " + secondEle + ")");

    }
}
