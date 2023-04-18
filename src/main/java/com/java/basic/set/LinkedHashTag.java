package com.java.basic.set;

import java.util.*;
import java.util.stream.Stream;

public class LinkedHashTag {
    // 저장순서를 유지하고 관리한다! > LinkedHashSet
    public static void linkedSet() {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        set1.add("z");
        set1.add("x");
        set1.add("y");

        Stream<String> stringStream = set1.stream();
        stringStream.forEach(System.out::println);

        Iterator<String> stringIterator = set1.iterator();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + "\t");
        }
    }
    public static void setToArray() {
        Set<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        // Set Interface 객체들은 일반 Array 변환이 가능하다!
        // 타입 배열명 = setName.toArray(new 타입명[set.size()]);
        String arr[] = set.toArray(new String[set.size()]);
//        for (String a : arr) {
//            System.out.print(a + "\t");
//        }
        for (int index = 0; index <= arr.length-1; index++) {
            System.out.print(index);
            System.out.print(arr[index] + "\t");
        }
    }
    public static void main(String[] args) {
        setToArray();
    }
}
