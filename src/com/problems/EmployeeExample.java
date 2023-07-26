package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setName("Raj1");
        e1.setSlaary(20000L);
employeeList.add(e1);

        Employee e2 = new Employee();
        e2.setName("Raj2");
        e2.setSlaary(30000L);
        employeeList.add(e2);

        Employee e3 = new Employee();
        e3.setName("Raj3");
        e3.setSlaary(40000L);
        employeeList.add(e3);

        Employee e4 = new Employee();
        e4.setName("Raj4");
        e4.setSlaary(50000L);
        employeeList.add(e4);

        Employee e5 = new Employee();
        e5.setName("Raj6");
        e5.setSlaary(60000L);
        employeeList.add(e5);

        //Arrays.sort(employeeList, new EmpoyeeComparator());

        System.out.println(employeeList.get(3).getName());




    }
}
