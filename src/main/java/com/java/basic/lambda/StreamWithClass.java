package com.java.basic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
    private String University;
    private int num;

    public Student(String University, int num) {
        this.University = University;
        this.num = num;
    }

    public String getUniversity() {
        return University;
    }

    public int getNum() {
        return num;
    }
}

public class StreamWithClass {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("수원대학교", 2420001),
                new Student("고려대학교", 272272)
        );
        Stream<Student> studentStream = students.stream();
        studentStream.forEach(student -> System.out.println("대학교: " + student.getUniversity()));
    }
}
