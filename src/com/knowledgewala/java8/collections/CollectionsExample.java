package com.knowledgewala.java8.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP", 250000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenevo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));

        // Fetch Price
        List<Float> collect = productList.stream().map(x -> x.getPrice())
                .collect(Collectors.toList());

        System.out.println(collect);

        List<String> collect1 = productList.stream().map(x -> x.getName())
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = productList.stream().map(x -> x.getId())
                .collect(Collectors.toList());
        System.out.println(collect2);

        // collect toSet
        Set<String> collect3 = productList.stream().map(x -> x.getName())
                .collect(Collectors.toSet());
        System.out.println(collect3);

        // sum
        Double collect4 = productList.stream().collect(Collectors.summingDouble(x -> x.getPrice()));
        System.out.println(collect4);

        // Average
        Double collect5 = productList.stream().collect(Collectors.averagingDouble(x -> x.getPrice()));
        System.out.println(collect5);

        // count
        Long collect6 = productList.stream().collect(Collectors.counting());
        System.out.println(collect6);
    }
}
