package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Write a Java program which finds triplets in the given array whose sum is equal to given number?
public class TripletsExmple {
    public static void main(String[] args) {

        triplets(new int[]{7, 5, 9, 3, 0, 8, 6}, 12);

        System.out.println("===========================");

        triplets(new int[]{-3, 7, -1, -5, 2, -9, 1}, 0);

        System.out.println("===========================");

        triplets(new int[]{17, 51, 39, 29, 33, 21, 65}, 89);

        getArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});

        System.out.println("===========================================");

        getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});

        System.out.println("===========================================");

        getArrayTriplets(new int[] {1, 3, 9, 2, 6, 4, 8, 5, 7});
    }

    private static void triplets(int[] arr, int sum) {
        System.out.println("Gven Array ::" + Arrays.toString(arr));
        System.out.println("Given Number ::" + sum);
        System.out.println("Array Triplets whose sum is " + sum + " are :");
        // Sort an Array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == sum) {
                    System.out.println("[" + arr[i] + " , " + arr[left] + " , " + arr[right] + "]");
                    left++;
                    right--;
                } else if (arr[i] + arr[left] + arr[right] < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    private static void getArrayTriplets(int[] arr){
        System.out.println("Input Array is ::" + Arrays.toString(arr));

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(set.contains(arr[i]+arr[j])){
                    System.out.println("["+arr[i]+", "+arr[j] + "]");
                }
            }
        }
    }
}
