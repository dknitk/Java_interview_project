package com.oracle;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OracleIntervExample {
    public static void main(String[] args) {
        String str = "Welcome to Oracle Interview";
        char[] charArray = str.toCharArray();
        List<String> list = new ArrayList<>();
        for(char c : charArray){
            list.add(String.valueOf(c).toUpperCase().trim());
        }
        /**
         *
         * Stream
         */
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

        Map<String, Integer> map = new LinkedHashMap();
        for(String str1 : list){
            if(map.containsKey(str1)){
                map.put(str1, map.get(str1)+1);
            }else{
                map.put(str1, 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Iterator<Map.Entry<String, Integer>> it = set.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getValue() == 1){
                System.out.println("First non repetitive char ::" + entry.getKey());
                break;
            }
        }
    }
}
