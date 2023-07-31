package com.javabasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;


public class SecondSmallestElementFromArray {

    public static void main(String[] args) {

        int[] arr = {111, 333, 555, 777, 333, 444, 555};

        // Duplicate Elements in the array
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = Arrays.stream(arr).filter(e -> !uniqueElements.add(e))
                .boxed().collect(Collectors.toSet());
        System.out.println(duplicateElements);

        // Second min element in the array

        System.out.println(Arrays.stream(arr).distinct()
                .sorted().skip(1).findFirst()
                .orElseThrow(NoSuchElementException::new));

        System.out.println("Second Largest :: " + secondLargest(arr));
    }

    private static int secondLargest(int[] input) {
        int firstLargest, secondLargest;

        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        } else {
            firstLargest = input[1];
            secondLargest = input[0];

        }
        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                secondLargest = input[i];

            }
        }
        return secondLargest;
    }
}
