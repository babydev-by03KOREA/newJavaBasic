package com.java.basic.basic.Memory;

import java.awt.*;

public class Airport extends Thread {

    public Airport(String company) {
        super(company);
    }

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " Airline take off after " + i*10 + " minutes");
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Airport airplane1 = new Airport("Asiana Airline");
        Airport airplane2 = new Airport("Korean Air");
        Airport airplane3 = new Airport("Jeju Air");

        airplane1.start();
        airplane2.start();
        airplane3.start();
    }
}
