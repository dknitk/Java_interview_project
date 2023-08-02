package com.interview;


import java.util.stream.IntStream;

public class JoinExampleJava8 {
    public static void main(String[] args) {
        String result = String.join(",",new String[]{"1","2","3","4","5","6"});
        System.out.println(result);

        // Skip and Limit Example
        IntStream.rangeClosed(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);


    }
}
