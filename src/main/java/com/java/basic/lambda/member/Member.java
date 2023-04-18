package com.java.basic.lambda.member;

public class Member {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
