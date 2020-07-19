package firstMacJava;

// 代理类要实现 与 被代理类相同的接口
public class TestStaPProxy implements TestStaP {
    // 代理类中要有一个 变量存储 被代理对象
    private TestStaP tsp = new TestStaPImpl();

    public void sayHello(String content, int age) {
        System.out.println("ProxyTest sayHello begin");
        //在代理类的方法中 间接访问被代理对象的方法
        //剩下的两行输出 都算是功能的扩展
        tsp.sayHello(content, age);
        System.out.println("ProxyTest sayHello end");
    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        System.out.println("ProxyTest sayHello begin");
        //在代理类的方法中 间接访问被代理对象的方法
        //剩下的两行输出都算是功能的扩展
        tsp.sayGoodBye(seeAgin, time);
        System.out.println("ProxyTest sayHello end");
    }

    public static void main(String[] args) {
        TestStaPProxy tspp = new TestStaPProxy();
        tspp.sayHello("lily", 18);
    }
}
