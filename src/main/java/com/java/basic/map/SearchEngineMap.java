package com.java.basic.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SearchEngineMap {
    public static void search() {
        TreeMap<String, Integer> searchMap = new TreeMap<>();
        searchMap.put("Java", 10);
        searchMap.put("Python", 20);
        searchMap.put("Scala", 40);
        searchMap.put("JavaScript", 30);

        NavigableMap<String, Integer> searchNavigation = searchMap.subMap("J",true, "P", true);
        // map<>에 대한 반복자를 획득하기 Map.Entry.entrySet()
        for (Map.Entry<String, Integer> searchEntry : searchNavigation.entrySet()) {
            System.out.println("[KEY] > " + searchEntry.getKey() + " [VALUE] > " + searchEntry.getValue());
        }
    }
    public static void main(String[] args) {
        search();
    }
}
