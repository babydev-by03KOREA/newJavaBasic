package com.java.basic.basic.Variable;

import java.util.ArrayList;
import java.util.Arrays;

public class StringBuild {
    /* String > 변경 불가한 문자열을 생성 String + String = 메모리 성능에 좋지않음!
    *  StringBuilder > 변경 가능한 문자열을 만들어줌! */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
        // String에 StringBuilder을 그대로 넣을 수 없다! toString Object method 사용!
        String str = stringBuilder.toString();
        System.out.println("StringBuilder() > " + stringBuilder);
        System.out.println("toString() > " + str);

        StringBuilder stringBuilderList = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("첫번째, ", "두번째, ", "세번째, ", "네번째, ", "다섯번째"));
        for (int a = 0; a < list.size(); a++) {
            // list[0] + list[1] + ...
            stringBuilderList.append(list.get(a));
        }
        System.out.println(stringBuilderList);
    }
}
