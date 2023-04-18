package com.java.basic.lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class IterationMapLambda {
    public static void lambdaIteration() {
        Map<String, String> lambdaMap = new HashMap<>();
        lambdaMap.put("lambdaKey1", "lambdaValue1");
        lambdaMap.put("lambdaKey2", "lambdaValue2");
        lambdaMap.put("lambdaKey3", "lambdaValue3");
        lambdaMap.put("lambdaKey4", "lambdaValue4");
        lambdaMap.put("lambdaKey5", "lambdaValue5");

        lambdaMap.forEach((key, value) ->
                System.out.println("[KEY] > " + key + " [VALUE] > " + value)
        );
    }
    public static void lambdaStreamMap() {
        Map<Integer, String> lambdaMap = new HashMap<>();
        lambdaMap.put(1, "lambdaStream1");
        lambdaMap.put(2, "lambdaStream2");
        lambdaMap.put(3, "lambdaStream3");
        lambdaMap.put(4, "lambdaStream4");
        lambdaMap.put(5, "lambdaStream5");

        lambdaMap.entrySet().stream().forEach(integerStringEntry -> // {} 안에 sout 입력하면 세미콜론 필요!
                System.out.println("[key] = " + integerStringEntry.getKey()
                        + " [value] = " + integerStringEntry.getValue())
        );
        System.out.println("내림차순 정렬 / compare: 비교하다");
        lambdaMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(integerStringEntry -> {
            System.out.println("[key] = " + integerStringEntry.getKey()
                    + " [value] = " + integerStringEntry.getValue());
        });
        System.out.println("오름차순 정렬");
        lambdaMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(integerStringEntry -> {
            System.out.println("[key] = " + integerStringEntry.getKey()
                    + " [value] = " + integerStringEntry.getValue());
        });
    }

    public static void main(String[] args) {
        lambdaStreamMap();
    }
}
