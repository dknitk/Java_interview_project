package com.problems;

import java.util.Comparator;

public class EmpoyeeComparator implements Comparator<com.problems.Employee> {



    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSlaary() - o2.getSlaary());
    }
}
