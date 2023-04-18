package com.java.basic.list;

import java.util.*;

public class list {
    public static void main(String[] args) {
        // List > Array 한계를 극복하기 위해 만들어짐. / 용량이 가변적임!
        // 검색이 많은 경우에 주로 사용됩니다. / 참조에 용의함
        // <> > Generic / Integer iData = (Integer)a.get(0); 이렇게 사용했었음.
        List<Integer> list1 = new ArrayList<>();
        // 초기용량을 설정 가능하다. > list2.size(); = 0 / 초기용량만 설정되어있음.
        List<Integer> list2 = new ArrayList<>(10);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            list1.add(random.nextInt(30) + 1);
        }

        System.out.println("=====RANDOM ARRAYLIST=====");
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i) + "\t");
        }

        System.out.println();
        System.out.println("=====ADD TO INDEX 3=====");
        list1.add(3, 35);
        for (Integer integer : list1) {
            // list1.get(integer) X / 배열명을 적어줬기 때문.
            System.out.print(integer + "\t");
        }

        System.out.println();
        System.out.println("=====SET INDEX 0 TO NUMBER 55=====");
        list1.set(0, 55);
        for (Integer i : list1) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println("=====ITERATOR=====");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();

        System.out.println("=====LIST ITERATOR=====");
        ListIterator<Integer> listIterator = list1.listIterator(list1.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + "\t");
        }
        System.out.println();

        System.out.println("=====SIZE COMPARE=====");
        System.out.println("NOW ARRAYLIST SIZE > " + list1.size());
        list1.remove(4);
        System.out.println("REMOVE INDEX 4 SIZE > " + list1.size());
        System.out.println("list2 SIZE > " + list2.size());
        System.out.println("list3 SIZE > " + list3.size());

        System.out.println("=====IS CONTAINED?=====");
        System.out.println("is 35 in list1? > " + list1.contains(35));

        System.out.println("====ALL CLEAR=====");
        list1.clear();

        System.out.println("=====IS EMPTY?=====");
        System.out.println("is list1 Empty? > " + list1.isEmpty());

        List<newArray> list4 = new ArrayList<>();
        list4.add(new newArray(1,2,3));
        System.out.println("=====NEW ARRAYLIST=====");
        for (newArray l : list4) {
            System.out.print(l.a + "\t" + l.b + "\t" + l.c + "\t");
        }
    }
}

class newArray {
    int a;
    int b;
    int c;
    newArray(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
