package com.interview;

// Write a Java program to find second largest element in an array of integers?
public class SecondLarestFromArray {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] {2, 2, 3, 3, 4, 5, 6, 71, 23}));

        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    }

    private static int secondLargest(int[] arr) {
        int firstLargest;
        int secondLargest;
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
        return secondLargest;
    }
}

