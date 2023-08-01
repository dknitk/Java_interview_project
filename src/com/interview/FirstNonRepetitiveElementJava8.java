package com.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetitiveElementJava8 {
    public static void main(String[] args) {
        String str = "ilovejavatechei";
        findFirstNonRepetitiveElement(str);
        findFirstRepetitiveElement(str);
    }
    private static void findFirstNonRepetitiveElement(String str){

        String key = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println("Find First Non Repetitive Number :: "+ key);
    }

    private static void findFirstRepetitiveElement(String str){

        String key = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst().get().getKey();

        System.out.println("Find First Non Repetitive Number :: "+ key);
    }
}
