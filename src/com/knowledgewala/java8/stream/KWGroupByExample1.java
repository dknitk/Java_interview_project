package com.knowledgewala.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KWGroupByExample1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "oragnge",
                "papaya");

        Map<String, Long> collect = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}
