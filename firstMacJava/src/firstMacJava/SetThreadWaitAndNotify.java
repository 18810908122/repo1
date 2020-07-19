package firstMacJava;

public class SetThreadWaitAndNotify implements Runnable {

    private Student s;
    private int x;

    public SetThreadWaitAndNotify(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if (s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    s.name = "lilyyang";
                    s.age = 18;
                } else {
                    s.name = "maryMa";
                    s.age = 10;
                }
                x++;
                s.flag = true;
                s.notify();
            }

        }

    }

}
