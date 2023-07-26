package com.oracle;
import java.util.*;

public class OracleIntervStreamExample {
    public static void main(String[] args) {
        String str = "Welcome to Oracle Interview";
        char[] charArray = str.toCharArray();
        /* This is sorted so we can not fetch correct first character
        Map map1 = list.stream().filter(strtmp -> !strtmp.equals("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/
        Map<String, Integer> map1 = new LinkedHashMap();
        for(char ch : charArray){
            if(!String.valueOf(ch).equals("")){
                String temp = String.valueOf(ch).toUpperCase();
                map1.put(temp, map1.containsKey(temp)? map1.get(temp)+1:1);
            }
        }
        System.out.println(map1.entrySet().stream().filter(x -> x.getValue() == 1).findAny().get().getKey().toString());
    }
}
