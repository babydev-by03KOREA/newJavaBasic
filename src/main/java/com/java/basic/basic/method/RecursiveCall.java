package com.java.basic.basic.method;

public class RecursiveCall {
    // 재귀호출 > 본인 스스로를 호출한다.
    static int factorial(int n) {
        int result = 0;
        if (n <= 0 || n > 12) {
            System.out.println("0보다 작거나 12보다 클 수 없습니다.");
            return -1;
        }
        if (n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);  // 자기 자신을 호출함!
        return result;
    }

    public static void main(String[] args) {
        int factorialResult = factorial(0);
        System.out.println(factorialResult);
    }
}
