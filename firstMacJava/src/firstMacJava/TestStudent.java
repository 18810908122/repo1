package firstMacJava;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    // 测试 Student中的main方法
    public static void main(String[] args) throws Exception {

//		Class clazz = Class.forName("firstMacJava.Student");
//		Method m = clazz.getMethod("main", String[].class);
//		m.invoke(null, (Object)new String[] {""});

        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        Class clazz = arrayList.getClass();
        Method addM = clazz.getMethod("add", Object.class);
        addM.invoke(arrayList, 100);
//		for (Object obj : arrayList) {
//			System.out.println(obj);
//		}
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
