package com.interview;

// Write a Java program to find second largest element in an array of integers?
public class SecondLarestFromArray {
    public static void main(String[] args) {
        int firstLargest, secondLargest;
        int[] arr = {2, 2, 3, 3, 4, 5, 6, 71, 23};
        // arr = new int[]{47498, 14526, 74562, 42681, 75283, 45796};

        if (arr[0] > arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest is ::" + secondLargest);
    }
}
