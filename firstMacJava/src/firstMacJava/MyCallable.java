package firstMacJava;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    // Callable接口有泛型，所以是带返回值的线程
    // 该泛型类型与call()方法的返回值类型一致
    private int num;

    public MyCallable(int num) { // 可以接收不同的参数
        this.num = num;
    }

    @Override // 计算不同范围的求和
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
