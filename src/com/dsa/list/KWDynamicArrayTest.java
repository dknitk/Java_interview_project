package com.dsa.list;

public class KWDynamicArrayTest {
    public static void main(String[] args) {
        KWDynamicArray kwDynamicArray = new KWDynamicArray();
        System.out.println(kwDynamicArray.size);
        System.out.println(kwDynamicArray.capacity);
        System.out.println(kwDynamicArray.array.length);
        // Add Element
        kwDynamicArray.add(20);
        kwDynamicArray.add(30);
        System.out.println(kwDynamicArray);
        System.out.println(kwDynamicArray.isEmpty());

        kwDynamicArray.insert(2,12);
        kwDynamicArray.insert(2,22);
        System.out.println(kwDynamicArray);
        kwDynamicArray.delete(12);
        System.out.println(kwDynamicArray);

        System.out.println(kwDynamicArray.search(22));
    }
}
