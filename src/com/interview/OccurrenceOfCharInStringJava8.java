package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccurrenceOfCharInStringJava8 {

    public static void main(String[] args) {
        String input = "ilovejavatechie";
        findOccurrenceOfChar(input);

    }
    private static void findOccurrenceOfChar(String str){

        /*Map<String, List<String>> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s));*/

        /*Map<char[], Long> collect = Arrays.asList(str.toCharArray()).stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        Map<String, Long> longMap = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(longMap.toString());
    }
}
