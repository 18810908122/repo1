package firstMacJava;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;


// 动态代理类
public class TestPersonProxy {
    // 设计一个类变量记住代理类要代理的目标对象
    private TestPerson tpreal = new TestPersonImpl();

    // 设计一个方法生成代理对象
    public TestPerson getProxy() {
        return (TestPerson) Proxy.newProxyInstance(TestPersonProxy.class.getClassLoader(), tpreal.getClass().getInterfaces(),
                new ProxyReality()); // 此处也可以用InvocationHandler的匿名内部类接口实现
//				new InvocationHandler() {
//										// 此处的Object是从 与代理类中 关联的被代理对象这一变量处获得
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						if (method.getName().equals("sing")) {
//							System.out.println("我是他的经纪人");
//							return method.invoke(tpreal, args);
//						}
//						if (method.getName().equals("dance")) {
//							System.out.println("我是他的经纪人");
//							return method.invoke(tpreal, args);
//						}					
//						return null;
//					}
//				});
    }

    public static void main(String[] args) {
        // 生成动态代理
        TestPersonProxy tpp = new TestPersonProxy();
        // 获取代理对象
        TestPerson tps = tpp.getProxy();
        System.out.println(tps.getClass().getName());
        System.out.println(tps.getClass().getSuperclass());
        Class<?>[] interfaces = tps.getClass().getInterfaces();

        for (Class<?> inter : interfaces) {
            System.out.println(inter.getName());
        }


        tps.sing("tun");
    }
}

class ProxyReality implements InvocationHandler {
    private Object h;

    //	private TestPerson tprealppp = new TestPersonImpl();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println(proxy);
        System.out.println(proxy.getClass().getName());
        if (method.getName().equals("sing")) {
            System.out.println("我是他的经纪人");
//			return method.invoke(tprealppp, args);
        }
        if (method.getName().equals("dance")) {
            System.out.println("我是他的经纪人");
//			return method.invoke(tprealppp, args);
        }
        return null;
    }
//	


}
