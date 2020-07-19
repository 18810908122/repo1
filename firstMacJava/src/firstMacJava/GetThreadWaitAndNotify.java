package firstMacJava;

public class GetThreadWaitAndNotify implements Runnable {

    private Student s;

    public GetThreadWaitAndNotify(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if (!s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println(s.name + "---" + s.age);
                s.flag = false;
                s.notify();
            }

        }

    }

}
