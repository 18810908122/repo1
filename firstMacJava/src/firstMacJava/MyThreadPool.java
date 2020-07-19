package firstMacJava;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThreadPool {

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
//		// 创建可以存放两个线程的线程池
//		ExecutorService es = Executors.newFixedThreadPool(2);
//		// 实现Callable 接口的线程 带有返回值，其返回结果用 带泛型的Future接收
//		Future<Integer> fu1 = es.submit(new MyCallable(100));
//		Future<Integer> fu2 = es.submit(new MyCallable(50));
//		// 到这里两个线程执行完毕，然后放回线程池，等待下次使用
//		
//		// 最后用 带泛型的Future的 get()方法得到具体的返回值
//		Integer i1 = fu1.get();
//		Integer i2 = fu2.get();
//		System.out.println(i1+"\n"+i2);
////		es.shutdown(); // 关闭线程池
        new Thread().start();


    }
}
