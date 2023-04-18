package com.java.basic.controlStatement;

public class ImprovedFor {

    static void normalFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i Value : " + i);
        }
    }

    static String[] arr = {"A", "B", "C", "D", "E", "F", "U"};

    static void improvedFor() {
        for (String obj : arr) {
            System.out.print(" " + obj);
        }
    }

    public static void main(String[] args) {
        normalFor();
        improvedFor();
    }
}
