package com.employee.stats;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStats {
    public static void main(String[] args) {

        DoubleSummaryStatistics doubleSummaryStatistics = getEmployees().stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("****** Statistics on Employee Salary ******");
        System.out.println("Max Salary from the given Data :: " + doubleSummaryStatistics.getMax());
        System.out.println("Min Salary from the given Data :: " + doubleSummaryStatistics.getMin());
        System.out.println("Average Salary from the given Data :: " + doubleSummaryStatistics.getAverage());
        System.out.println("Total Sum of Salary from the given Data :: " + doubleSummaryStatistics.getSum());
        System.out.println("Total Number of Employee's Salary from the given Data :: " + doubleSummaryStatistics.getCount());

        IntSummaryStatistics intSummaryStatistics = getEmployees().stream().collect(Collectors.summarizingInt(Employee::getAge));
        System.out.println("****** Statistics on Employee Age ******");
        System.out.println("Max Age from the given Data :: " + intSummaryStatistics.getMax());
        System.out.println("Min Age from the given Data :: " + intSummaryStatistics.getMin());
        System.out.println("Average age from the given Data :: " + intSummaryStatistics.getAverage());
        System.out.println("Total Sum of age from the given Data :: " + intSummaryStatistics.getSum());
        System.out.println("Total Number of Employee's age from the given Data :: " + intSummaryStatistics.getCount());

        System.out.println("***** Group By Designation *****");
        Map<String, List<Employee>> groupByDesignation = getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDesignation));
        for(String designation : groupByDesignation.keySet()){
            System.out.println("****** " + designation + " *******");
            groupByDesignation.get(designation).forEach(System.out::println);
        }
    }

    private static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Dharmendra Sahu", 37, EmployeeDesignation.EM.name(), EmployeeBAND.F.name(), 234512.12));
        employeeList.add(new Employee(2, "Rajendra Sahu", 45, EmployeeDesignation.PM.name(), EmployeeBAND.F.name(), 23234));
        employeeList.add(new Employee(3, "Jitendra Sahu", 34, EmployeeDesignation.EM.name(), EmployeeBAND.F.name(), 24512.12));
        employeeList.add(new Employee(4, "Gopal Sahu", 39, EmployeeDesignation.BA.name(), EmployeeBAND.F.name(), 343434));
        return employeeList;
    }
}

enum EmployeeDesignation {
    EM, PM, BA, SE, SSE, LED, ARCHITECTURE, PO
}

enum EmployeeBAND {
    A, B, C, D, E, F, G
}
