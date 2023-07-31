package com.interview;

import java.util.*;
import java.util.stream.Collectors;

// Write a Java program to find duplicate elements in an array?
public class DuplicatesInArray {
    public static void main(String[] args) {
        System.out.println("Find Duplicated in the arrays");
        int[] array = new int[]{111, 333, 555, 777, 333, 444, 555};
        extracted(array);
        findDuplicateUsingSorting(array);
        findDuplicateUsingSt(array);
        findDuplicateUsingHashMap(array);

        findDuplicateUsingJava8(array);
    }

    private static void extracted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate Element :: " + array[i]);
                }
            }
        }
    }

    private static void findDuplicateUsingSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate Element ::" + arr[i]);
            }
        }
    }

    private static void findDuplicateUsingSt(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println("Duplicate Element ::" + arr[i]);
            }
        }
    }

    private static void findDuplicateUsingHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element ::" + entry.getKey());
            }
        }
    }

    private static void findDuplicateUsingJava8(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = Arrays.stream(arr).filter(i -> !set.add(i)).boxed().collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }
}
