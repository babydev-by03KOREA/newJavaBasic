package com.java.basic.wrapper;

public class WrapperClass {
    static void Boxing() {
        Integer num = new Integer(10);  // Boxing
        int n = num.intValue(); // UnBoxing
        System.out.println(n);
    }

    static void ABoxing() {
        Integer autoBoxing = 17;
        int ab = autoBoxing;
        System.out.println(ab);
    }

    public static void main(String[] args) {
        Boxing();
        ABoxing();
    }
}
