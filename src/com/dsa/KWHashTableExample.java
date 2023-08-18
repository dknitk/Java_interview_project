package com.dsa;

import java.util.Hashtable;

public class KWHashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable();

        hashTable.put(100, "Spongbob");
        hashTable.put(123, "Patrick");
        hashTable.put(321, "Sandy");
        hashTable.put(555, "Squidward");
        hashTable.put(777, "Gary");

        for (Integer key : hashTable.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashTable.get(key));
        }


    }
}
