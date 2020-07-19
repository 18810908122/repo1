package firstMacJava;

public class DiedThreadTest extends Thread {

    private boolean flag;

    public DiedThreadTest(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (LockObject.obj1) {
                System.out.println("if obj1");
                synchronized (LockObject.obj2) {
                    System.out.println("if obj2");
                }
            }
        } else {
            synchronized (LockObject.obj2) {
                System.out.println("else obj2");
                synchronized (LockObject.obj1) {
                    System.out.println("else obj1");
                }
            }
        }

    }

    public static void main(String[] args) {
        DiedThreadTest dtt1 = new DiedThreadTest(true);
        DiedThreadTest dtt2 = new DiedThreadTest(false);
        dtt1.start();
        dtt2.start();
    }
}
