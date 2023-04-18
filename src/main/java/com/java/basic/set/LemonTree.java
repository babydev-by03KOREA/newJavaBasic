package com.java.basic.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class LemonTree {
    // TreeSet > 이진트리 기반으로 한 Set Collection / 오름차순으로 자동정렬해줌!
    public static void treeSet1() {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(56);
        treeSet.add(30);
        treeSet.add(77);
        treeSet.add(66);
        treeSet.add(98);

        Integer score = null;

        // 가장 낮은 객체(낮은숫자)
        score = treeSet.first();
        System.out.println("가장 낮은 점수 " + score);

        // 가장 큰 객체(높은숫자)
        score = treeSet.last();
        System.out.println("가장 높은 점수 " + score);

        // new 키워드 사용시 주소가 달라진다!
        // 해당 객체 바로 아래있는 객체 찾기
        score = treeSet.lower(new Integer(80));
        System.out.println("80점 아래 점수 " + score);

        // 해당 객체 바로 위에있는 객체 찾기
        score = treeSet.higher(new Integer(60));
        System.out.println("60점 위 점수 " + score);

        // 77점 이거나 바로 아래 점수
        score = treeSet.floor(new Integer(77));
        System.out.println("77점 이거나 바로 아래 점수 " + score);

        // 98점 이거나 바로 위 점수
        score = treeSet.ceiling(new Integer(98));
        System.out.println("98점 이거나 바로 위 점수 " + score);

        // 만약 treeSet.isEmpty()가 아니라면
        while (!treeSet.isEmpty()) {
            // 제일 낮은 객체를 꺼내고 컬렉에서 제거함.
            score = treeSet.pollFirst();
            System.out.println(score + " 제거");
            System.out.println("현재 treeSet size " + treeSet.size());
        }
        System.out.println("SET IS EMPTY!");
    }
    public static void treeSet2() {
        TreeSet<Integer> score = new TreeSet<>();
        score.add(new Integer(80));
        score.add(new Integer(70));
        score.add(new Integer(60));
        score.add(new Integer(50));
        score.add(new Integer(40));
        // 내림차순 정렬하기!
        NavigableSet<Integer> descendingSet = score.descendingSet();

        for (Integer num : descendingSet) {
            System.out.print(num + "\t");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        // 오름차순 정렬하기!
        for (Integer up : ascendingSet) {
            System.out.print(up + "\t");
        }
        System.out.println();
    }
    public static void searchEngin() {
        TreeSet<Integer> score = new TreeSet<>();
        score.add(new Integer(100));
        score.add(new Integer(20));
        score.add(new Integer(60));
        score.add(new Integer(70));
        score.add(new Integer(40));

        // toElement: 검색 대상이 되는 숫자, inclusive: false - 미만, true - 이상 .descendingSet() 는 내림차순 정렬
        NavigableSet<Integer> result = score.headSet(70, false).descendingSet();

        System.out.println("70 미만의 정수 검색");
        for (Integer a : result) {
            System.out.print(a + "\t");
        }
        System.out.println();

        NavigableSet<Integer> result2 = score.headSet(70, true).descendingSet();
        System.out.println("70 이상의 정수 검색");
        for (Integer b : result2) {
            System.out.print(b + "\t");
        }
        System.out.println();

        NavigableSet<Integer> result3 = score.subSet(60, true, 100, false).descendingSet();
        System.out.println("60 이상 100 미만 사이의 정수 검색하기");
        for (Integer c : result3) {
            System.out.print(c + "\t");
        }
        System.out.println();

        TreeSet<String> searchEngine = new TreeSet<>();
        searchEngine.add("가나");
        searchEngine.add("다라마");
        searchEngine.add("바사아");
        searchEngine.add("자카타");

        NavigableSet<String> osm = searchEngine.subSet("가", true, "바", false);
        for (String o : osm) {
            System.out.print(o + "\t");
        }
    }
    public static void main(String[] args) {
        searchEngin();
    }
}
