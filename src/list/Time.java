package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Time {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        System.out.println("==== 중간에 삽입 ====");
        startTime = System.nanoTime();
        for(int i = 0 ; i <= 100000 ; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : " + (endTime - startTime ));


        startTime = System.nanoTime();
        for(int i = 0 ; i <= 100000 ; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime ));

        System.out.println();
        System.out.println("=== 순차적 추가 ===");

        startTime = System.nanoTime();
        for(int i = 0 ; i <= 100000 ; i++) {
            list1.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 :  " + (endTime - startTime ));

        startTime = System.nanoTime();
        for(int i = 0 ; i <= 100000 ; i++) {
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime ));

        System.out.println();
        System.out.println("=== 순차적 검색 ===");

        startTime = System.nanoTime();
        for(int i = 0 ; i <= 1000 ; i++) {
            list1.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간  :  " + (endTime - startTime ));

        startTime = System.nanoTime();
        for(int i = 0 ; i <= 1000 ; i++) {
            list2.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime ));


    }
}