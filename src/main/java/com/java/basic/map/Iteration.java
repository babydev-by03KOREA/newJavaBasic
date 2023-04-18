package com.java.basic.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iteration {
    /* Map.Entry / The only way to obtain a reference to a map entry is from the iterator of this collection-view.
     * 번: 맵 항목에 대한 참조를 얻는 유일한 방법은 이 컬랙션-뷰를 반복자에서 가져오는 것 입니다.
     * 즉 Map.Entry를 이용해야만 Map에 대한 참조값을 얻을 수 있다!
     * setValue()만이 Map 값을 변경할 수 있다! */
    public static void entrySetIteration() {
        // MAP<>의 출력법 : map.entrySet() 사용하기
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key01", "value01");
        stringMap.put("key02", "value02");
        stringMap.put("key03", "value03");
        stringMap.put("key04", "value04");
        stringMap.put("key05", "value05");

        for (Map.Entry<String, String> stringEntry : stringMap.entrySet()) {
            System.out.println("[key] : " + stringEntry.getKey() + " [Value] : " + stringEntry.getValue());
        }
    }
    public static void keySetMethod() {
        // keySet()으로 key를 가져와서 Value를 Map.get(key)로 뽑기.
        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("key01", "value01");
        stringMap2.put("key02", "value02");
        stringMap2.put("key03", "value03");
        stringMap2.put("key04", "value04");
        stringMap2.put("key05", "value05");

        // Map.Entry<String, String> 사용하지 않음!!
        for (String key : stringMap2.keySet()) {
            String Value = stringMap2.get(key);
            System.out.println("[Key] > " + key + " [Value] > " + Value);
        }
    }
    public static void EntrySetIterator() {
        // Iterator > hasNext > iterator.next > iterator.key/value
        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("key01", "value01");
        stringMap3.put("key02", "value02");
        stringMap3.put("key03", "value03");
        stringMap3.put("key04", "value04");
        stringMap3.put("key05", "value05");

        // entrySet() Iterator로 부터 map 요소의 참조를 얻는 유일한 entry 요소입니다.
        Iterator<Map.Entry<String, String>> entryIterator = stringMap3.entrySet().iterator();
        System.out.println("Map in Entry > entrySet().iterator()");
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) entryIterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("[Key] > " + key + " [Value] > " + value);
        }
    }
    public static void keyIterator() {
        Map<String, String> stringMap4 = new HashMap<>();
        stringMap4.put("key01", "value01");
        stringMap4.put("key02", "value02");
        stringMap4.put("key03", "value03");
        stringMap4.put("key04", "value04");
        stringMap4.put("key05", "value05");

        // Set<K>.keySet(): 값들이 저장되어있는 collection view를 리턴합니다.
        // Iterator<>.iterator(): set<>집합의 모든 요소를 포함하는 배열을 리턴합니다.
        Iterator<String> iteratorK = stringMap4.keySet().iterator();
        System.out.println("Iterator.keySet().iterator()");
        while (iteratorK.hasNext()) {
            String key = iteratorK.next();
            String value = stringMap4.get(key);
            System.out.println("[KEY] > " + key + " [VALUE] > " + value);
        }

        // keySet()따로 iterator()따로 생성하는법
        Set<String> mapToSet = stringMap4.keySet();
        Iterator<String> mapSetIterator = mapToSet.iterator();
        System.out.println("Map > Set > Iterator > key > value");
        while (mapSetIterator.hasNext()) {
            String key = mapSetIterator.next();
            String Value = stringMap4.get(key);
            System.out.println("[KEY] > " + key + " [Value] > " + Value);
        }
    }

    public static void main(String[] args) {
        keyIterator();
    }
}
