package com.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberJava8 {
    public static void main(String[] args) {
        findSecondHighestInArray(new int[]{5,9,11,2,8,21,1});
        findSecondLowestInArray(new int[]{5,9,11,2,8,21,1});
    }
    private static void findSecondHighestInArray(int[] arr){

        /*List<Integer> collect = Arrays.stream(arr).boxed().sorted()
                .collect(Collectors.toList());*/

        Integer collect = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(collect);
    }

    private static void findSecondLowestInArray(int[] arr){

        Integer collect = Arrays.stream(arr).boxed()
                .sorted()
                .skip(1)
                .findFirst().get();
        System.out.println(collect);
    }
}
