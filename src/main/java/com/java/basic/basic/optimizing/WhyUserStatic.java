package com.java.basic.basic.optimizing;

public class WhyUserStatic {
    // 매개변수를 받지 않고 인스턴스변수로 처리합니다.
    int a, b;
    int add() { return a + b; }
    int subtract() {return a - b; }

    // static 사용해야할 때. 매개변수만으로도 처리가 가능하다.
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        WhyUserStatic why = new WhyUserStatic();
        why.a = 20;
        why.b = 10;
        System.out.println(why.add());
        System.out.println(why.subtract());

        System.out.println(WhyUserStatic.add(30, 10));
        System.out.println(WhyUserStatic.subtract(30, 10));
    }
}
