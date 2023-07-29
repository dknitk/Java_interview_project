package com.javabasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaBasicExample {
    public static void main(String[] args) {
        System.out.println("My Java Basic Example");
        System.out.println("There are double quotes \"\"");
        System.out.println("The file is located at ~\\Desktop\\FunnyCatPics");
        System.out.println("This is a tab \t!");
        System.out.println("This \n is \n on \n multiple lines");

        int[] numbers = {10, 20,30,40,50};
        for(int i =0;i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        Date currentDate = new Date();
        System.out.println(" Current Date is :: "+currentDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDateFormat.format(currentDate));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(simpleDateFormat1.format(currentDate));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateFormat2.format(currentDate));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("h:mm a");
        System.out.println(simpleDateFormat3.format(currentDate));


    }
}
