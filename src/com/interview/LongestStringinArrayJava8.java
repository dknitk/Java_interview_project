package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringinArrayJava8 {
    public static void main(String[] args) {

        String[] strArray = {"java", "techie", "springboot", "microservices","Dockermylovefhffggfhhfhf"};
        findLongestStringInArray(strArray);

        int[] arrnum = {5,9,11,2,8,21,1};
        findElementStartWithGivenNumber(arrnum, 1);

    }
    private static void findLongestStringInArray(String[] arr ){

        String s = Arrays.stream(arr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(s);
    }

    private static void findElementStartWithGivenNumber(int[] arr, int num){

        List<String> collect = Arrays.stream(arr).boxed().map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
