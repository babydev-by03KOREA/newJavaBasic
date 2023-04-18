package com.java.basic.basic.Variable;

public class VariableAndMethod {
    int num = 10;    // 인스턴스 변수
    static int sNum = 100;    // 클래스 변수, static 변수, 공유변수
    // method() 영역!
    public void method() {
        int mNum = 0;   // 지역변수
    }

    public static void main(String[] args) {
        VariableAndMethod vam1 = new VariableAndMethod();
        VariableAndMethod vam2 = new VariableAndMethod();

        System.out.println("instance vam1 > " + vam1.num + " class vam1 > " + VariableAndMethod.sNum);

        System.out.println("값을 재할당합니다.");
        vam1.num = 50;
        vam1.sNum = 11;

        System.out.println("instance vam1 > " + vam1.num + " class vam1 > " + vam1.sNum);
        System.out.println("instance vam2 > " + vam2.num + " class vam2 > " + vam2.sNum);
    }
}
