package com.knowledgewala.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KWStreamExample {

    public static void main(String[] args) {
        System.out.println("Stream Program Example!");
        // obtainStreamFromArray();
        // findFirstExample();
        // convertStreamToArray();
        flatMapExample();
    }

    private static Employee[] getEmployeeArray() {
        // Let’s first obtain a stream from an existing array
        Employee[] employeeArray = {
                new Employee(1, "Dharmendra", 1234.522),
                new Employee(2, "Rajesh", 2312.333),
                new Employee(3, "Diwakar", 2323.33)
        };
        return employeeArray;
    }

    private static void obtainStreamFromArray() {
        Employee[] employeeArray = getEmployeeArray();

        List<Employee> empList = Stream.of(employeeArray).distinct().collect(Collectors.toList());
        System.out.println(" Of method :: " + empList);

        empList = Arrays.asList(employeeArray).stream().collect(Collectors.toList());
        System.out.println("Arrays asList :: " + empList);

        Stream<Employee> employeeStream = Stream.of(employeeArray[0], employeeArray[1]);
        empList = employeeStream.collect(Collectors.toList());
        System.out.println("Arrays of method with individual :: " + empList);

        Stream.Builder<Employee> streamBuilder = Stream.builder();
        streamBuilder.add(employeeArray[0]);
        streamBuilder.accept(employeeArray[1]);
        Stream<Employee> emplStreamBuilder = streamBuilder.build();
        emplStreamBuilder.collect(Collectors.toList()).forEach(System.out::println);


        // call method
        empList.stream().forEach(e -> e.salaryIncrement(100.0));
        // map name
        empList.stream().map(e -> e.getName()).collect(Collectors.toList()).forEach(System.out::println);
        // map salary
        empList.stream().map(e -> e.getSalary() * 2).collect(Collectors.toList()).forEach(System.out::println);
        // map
        empList.stream().map(e -> e.getSalary() > 2000).collect(Collectors.toList()).forEach(System.out::println);

    }

    private static void findFirstExample() {
        Employee[] employeeArray = {
                new Employee(1, "Dharmendra", 1234.522),
                new Employee(2, "Rajesh", 2312.333),
                new Employee(3, "Diwakar", 2323.33),
                new Employee(4, null, 0.0),
                null,
                null
        };
        // Print All Elements
        System.out.println("****** Print All Elements *********");
        Stream.of(employeeArray).collect(Collectors.toList()).forEach(System.out::println);
        // filter null object
        System.out.println("********* Filter Null Objects *********");
        Stream.of(employeeArray).filter(e -> e != null).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("********* Filter Null Objects && Salary >0 *********");
        Stream.of(employeeArray).filter(e -> e != null).filter(e -> e.getSalary() > 0)
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("********* Filter Null Objects && Salary >0 FindFirst*********");
        Employee employee = Stream.of(employeeArray).filter(e -> e != null).filter(e -> e.getSalary() > 0)
                .findFirst().get();
        System.out.println("Find First Example :: "+ employee);

        System.out.println("********* Filter Null Objects && Salary >0 FindFirst*********");
        employee = Stream.of(employeeArray).filter(e -> e != null).filter(e -> e.getSalary() > 100000)
                .findFirst().orElse(new Employee(5, "", 0.0));
        System.out.println("Find First OR else Example :: "+ employee);
    }

    private static void convertStreamToArray(){
        List<Employee> employees = List.of(
                new Employee(1, "Dharmendra", 1234.522),
                new Employee(2, "Rajesh", 2312.333),
                new Employee(3, "Diwakar", 2323.33),
                new Employee(4, null, 0.0)
                );
        Employee[] employeeArray = employees.stream().toArray(Employee[]::new);
        for(Employee e : employeeArray){
            System.out.println(e);
        }
    }

    private static void flatMapExample(){
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg")
        );
        List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(namesFlatStream);

        namesFlatStream = namesNested.stream().flatMap(Collection::stream)
                .filter(e -> !e.contains("Ga"))
                .collect(Collectors.toList());
        System.out.println(namesFlatStream);
    }
}
