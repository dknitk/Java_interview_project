package com.dsa;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {

        int[] array = {1, 3, 2, 4, 7, 5, 0};

        System.out.println("Before Sorting :::" + Arrays.toString(array));

        int start = 0;
        int end = array.length - 1;
        quickSort(array, start, end);

        System.out.println("After Sorting :::" + Arrays.toString(array));

    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
