package lambda;

public class Expression {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        });
        thread.setName("THREAD #1");
        thread.start();
    }
}
