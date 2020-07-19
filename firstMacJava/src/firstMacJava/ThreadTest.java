package firstMacJava;

public class ThreadTest extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        interrupt();
        System.out.println(getName());
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();
        System.out.println(tt.getPriority());


//		ThreadTest tt1 = new ThreadTest();
//		tt1.start();
    }
}
