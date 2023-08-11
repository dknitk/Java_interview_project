package com.knowledgewala.java8.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KWGroupByExample2 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "banana",
                "orange", "banana", "papaya");

        Map<String, Long> collect = items.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sort a map and add to final map
        Map<String, Long> finalMap = new LinkedHashMap<>();

        collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);

        /*items.stream()
                .collect(Collectors.groupingBy(Item::getPrice,
                        Collectors.mapping(Item::getName, Collectors.toSet())));


        Map<BigDecimal, Set<String>> result =
                (Map<BigDecimal, Set<String>>) items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item, Collectors.toSet())));*/


        // Stream to  char
        String str = "dharmendra";

        List<Character> collect1 = str.chars().mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        System.out.println(collect1);

        str.chars().filter(e -> e == 'd').mapToObj(x -> (char)x)
                .forEach(System.out::print);

    }
}
