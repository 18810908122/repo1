package firstMacJava;

public class ThreadWaitAndNotify {

    public static void main(String[] args) {

        Student s = new Student();
        SetThreadWaitAndNotify stwan = new SetThreadWaitAndNotify(s);
        GetThreadWaitAndNotify gtwan = new GetThreadWaitAndNotify(s);

//		new Thread(stwan).start();
//		new Thread(gtwan).start();

//		String name = new Thread(stwan).getThreadGroup().getName();
        System.out.println(new Thread(stwan).getThreadGroup().getName());
        System.out.println(new Thread(gtwan).getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}
