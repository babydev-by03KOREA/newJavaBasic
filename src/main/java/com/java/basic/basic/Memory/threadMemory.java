package com.java.basic.basic.Memory;

import java.util.ArrayList;

public class threadMemory extends Thread {    // Thread 클래스의 상속!
    // 일반적인 Thread 객체는 Thread-n 형태의 이름을 가진 스레드가 생성된다.
    int seq;

    public threadMemory(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " Start Thread!");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(this.seq + " Thread Stop!");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            threadMemory memory = new threadMemory(index);  // 10개의 Thread 생성! + Start run();
            // memory.run() X / memory.start(); JVM 작업 별도필요!
            memory.start();
            threads.add(memory);
        }

        for (int index = 0; index < threads.size(); index++) {
            Thread thread = threads.get(index);
            try {
                thread.join();  // thread 종료까지 대기!
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("main Method End.");
    }
}
