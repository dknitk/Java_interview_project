package com.knowledgewala.techschool;

import java.util.Date;
import java.util.List;

public class Student extends Person{

    private boolean international;
    private boolean isPartTime;
    private boolean isOnProbation;
    private List<Enroll> enrollLit;

    public Student(String firstName, String lastName, Date dateOfBirth, String phoneNumber,
                   List<Address> addresses, boolean international,
                   boolean isPartTime, boolean isOnProbation, List<Enroll> enrollLit) {
        super(firstName, lastName, dateOfBirth, phoneNumber, addresses);
        this.international = international;
        this.isPartTime = isPartTime;
        this.isOnProbation = isOnProbation;
        this.enrollLit = enrollLit;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }

    public boolean isOnProbation() {
        return isOnProbation;
    }

    public void setOnProbation(boolean onProbation) {
        isOnProbation = onProbation;
    }

    public List<Enroll> getEnrollLit() {
        return enrollLit;
    }

    public void setEnrollLit(List<Enroll> enrollLit) {
        this.enrollLit = enrollLit;
    }

    @Override
    public String toString() {
        return "Student{" +
                "international=" + international +
                ", isPartTime=" + isPartTime +
                ", isOnProbation=" + isOnProbation +
                ", enrollLit=" + enrollLit +
                '}';
    }
}
