package com.java.basic.map;

import java.util.*;

public class LemonTreeMap {
    public static void TreeMapUse() {
        TreeMap<Integer, String> stringTreeMap = new TreeMap<Integer, String>();

        stringTreeMap.put(4, "박형주");
        stringTreeMap.put(2, "한찬민");
        stringTreeMap.put(1, "한상준");
        stringTreeMap.put(3, "김민재");
        stringTreeMap.put(5, "신창윤");

        NavigableMap<Integer, String> descendingMap = stringTreeMap.descendingMap();
        System.out.println("내림차순");
        stringTreeMap.entrySet().stream().forEach(v ->
                System.out.println("[KEY] > " + v.getKey() + " [VALUE] > " + v.getValue())
        );

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        System.out.println("오름차순");
        stringTreeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(v -> {
            System.out.println("[KEY] > " + v.getKey() + " [VALUE] > " + v.getValue());
        });
    }
    public static void main(String[] args) {
        TreeMapUse();
    }
}
