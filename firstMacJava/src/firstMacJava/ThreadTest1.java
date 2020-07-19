package firstMacJava;

public class ThreadTest1 implements Runnable {

    private int tickets = 30;

    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + ":第" + tickets-- + "张票");
                }
            }

        }
    }

    public static void main(String[] args) {
        ThreadTest1 thread = new ThreadTest1();
        new Thread(thread, "线程1").start();
        new Thread(thread, "线程2").start();
    }
}
