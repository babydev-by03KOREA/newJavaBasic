package com.java.basic.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Compare {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("박형주", 20));
        treeSet.add(new Person("한상준", 24));
        treeSet.add(new Person("한찬민", 19));

//        Iterator<Person> personIterator = treeSet.iterator();
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            System.out.println(person.name + "-" + person.age);
//        }
        for (Person person : treeSet) {
            System.out.println(person.name + "-" + person.age);
        }
    }
}
class Person implements Comparable<Person> {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (age < p.age) return -1;
        else if (age == p.age) return 0;
        else return 1;
    }
}