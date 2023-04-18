package com.java.basic.basic.Memory.polymorphism;

public class UpDownCasting {
    // 조상!
    void drive() {
        System.out.println("부릉부릉~");
    }
    void stop() {
        System.out.println("끼익!");
    }
}
class FireEngine extends UpDownCasting {
    void water() {
        System.out.println("물 촤악!");
    }
}
class Ambulance extends UpDownCasting {
    void siren() {
        System.out.println("위이이잉!!");
    }
}
