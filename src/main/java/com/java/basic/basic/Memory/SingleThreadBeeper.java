package com.java.basic.basic.Memory;

import java.awt.*;

/* SingleThread Application | main thread Application
* 필요에 따라 작업 쓰레드를 만들어 병렬로 코드를 실행할 수 있습니다.
* 멀티 스레드는 메인 스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않습니다.*/

public class SingleThreadBeeper extends Thread {
    public static void main(String[] args) {
        // Toolkit > System Information Method
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("BEEP!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
