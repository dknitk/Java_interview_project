package com.javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadOnlyCollectionExample {
    public static void main(String[] args) {
        readOnlyList();

    }

    private static void readOnlyList(){
        List<String> originalList = new ArrayList<>();
        originalList.add("Ram");
        originalList.add("John");
        originalList.add("Carlos");
        originalList.add("David");
        originalList.add("Ian");
        originalList.add("Daniel");

        System.out.println("===== Original List =====");
        System.out.println(originalList);

        // Convert to read only
        List<String> readOnly = Collections.unmodifiableList(originalList);

        try{
            readOnly.add("shyam");
            readOnly.remove("ram");
            //readOnly.add()
        }catch (UnsupportedOperationException e){
            System.out.println(e.getCause());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
