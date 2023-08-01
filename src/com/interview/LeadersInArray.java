package com.interview;

import java.util.Arrays;
// Write a Java program to find all the leaders in an integer array?
public class LeadersInArray {
    public static void main(String[] args) {
        findLeadersInArray(new int[] {12, 9, 7, 14, 8, 6, 3});

        findLeadersInArray(new int[] {8, 23, 19, 21, 15, 6, 11});

        findLeadersInArray(new int[] {55, 67, 71, 57, 51, 63, 38});

        findLeadersInArray(new int[] {21, 58, 44, 14, 51, 36, 23});
    }
    private static void findLeadersInArray(int[] arr){
        int max = arr[arr.length - 1];
        System.out.println("The leaders in "+ Arrays.toString(arr)+" are : ");
        System.out.println(max);
        for(int i = arr.length - 2; i >= 0; i--){
            if(max < arr[i]){
                System.out.println(arr[i]);
                //Updating the max
                max = arr[i];
            }
        }
    }
}
