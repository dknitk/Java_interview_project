package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementFromStringJava8 {
    public static void main(String[] args) {
        findDuplicateElement("ilovejavatechei");

        findUniqueElement("ilovejavatechei");
    }
    private static void findDuplicateElement(String str){
        List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void findUniqueElement(String str){
        List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(m -> m.getKey())// map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
