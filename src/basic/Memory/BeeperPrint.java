package basic.Memory;

public class BeeperPrint {
    public static void main(String[] args) {
        // 작업 스레드 제작
//        Runnable rmb = new RunnableMemoryBeeper();
//        Thread thread = new Thread(rmb);
        Thread th = new Thread(new RunnableMemoryBeeper());

        // 작업 스레드와 메인 스레드가 동시에 시작됨!
//        thread.start();
        th.start();
    }
}
