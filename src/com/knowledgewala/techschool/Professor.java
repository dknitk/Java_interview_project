package com.knowledgewala.techschool;

import java.util.Date;
import java.util.List;

public class Professor extends Person{
    private double salary;
    private List<Course> courses;

    public Professor(String firstName, String lastName, Date dateOfBirth,
                     String phoneNumber, List<Address> addresses, double salary,
                     List<Course> courses) {
        super(firstName, lastName, dateOfBirth, phoneNumber, addresses);
        this.salary = salary;
        this.courses = courses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salary=" + salary +
                ", courses=" + courses +
                '}';
    }
}
