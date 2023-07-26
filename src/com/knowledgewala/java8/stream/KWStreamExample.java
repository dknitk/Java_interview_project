package com.knowledgewala.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KWStreamExample {

    public static void main(String[] args) {
        System.out.println("Stream Program Example!");
        obtainStreamFromArray();
    }

    private static void obtainStreamFromArray(){
        // Let’s first obtain a stream from an existing array
        Employee[] employeeArray = {
          new Employee(1, "Dharmendra", 1234.522),
          new Employee(2, "Rajesh", 23123123.333),
          new Employee(3, "Diwakar", 2323.33)
        };

        List<Employee> empList = Stream.of(employeeArray).distinct().collect(Collectors.toList());
        System.out.println(" Of method :: " + empList);

        empList = Arrays.asList(employeeArray).stream().collect(Collectors.toList());
        System.out.println("Arrays asList :: " + empList);
    }


}
