package basic.Memory;

import java.awt.*;

public class RunnableMemoryBeeper implements Runnable {
    // Runnable Interface Override > run() method 필수구현!
    @Override
    public void run() {
        // Java System Kit
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int index = 0; index < 5; index++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
