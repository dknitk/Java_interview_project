package com.designpattern_moss.factory;

/**
 * Factory Design Pattern Example
 */
public class KWFactoryDP {

    public Profession getProfession(String typeOfProfession){
        if(typeOfProfession == null){
            System.out.println("Null Object return");
            return null;
        }
        if("Doctor".equalsIgnoreCase(typeOfProfession)){
            System.out.println("Doctor Object return..");
            return new Doctor();
        }else if ("Engineer".equalsIgnoreCase(typeOfProfession)){
            System.out.println("Engineer Object return....");
            return new Engineer();
        }else if("Student".equalsIgnoreCase(typeOfProfession)){
            System.out.println("Student Object return....");
            return new Student();
        }
        System.out.println("No Match Found.....");
        return null;
    }

    public static void main(String[] args) {
        KWFactoryDP kwFactoryDP = new KWFactoryDP();
        kwFactoryDP.getProfession("Engineer");
        kwFactoryDP.getProfession("Doctor");
        kwFactoryDP.getProfession("Student");
        kwFactoryDP.getProfession("Teacher");
    }
}
