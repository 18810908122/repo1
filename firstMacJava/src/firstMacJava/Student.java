package firstMacJava;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;


public class Student {

    //**********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;
    boolean flag;
    StringBuilder sb = new StringBuilder();

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }

    //（默认的构造方法）
    Student(String str) {
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Student() {
//		System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Student(char name) {
        System.out.println("姓名：" + name);
        sb.append("helloxs");
    }

    //有多个参数的构造方法
    public Student(String name, int age) {
        System.out.println("姓名：" + name + "年龄：" + age);
    }

    //受保护的构造方法
    protected Student(boolean n) {
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Student(int age) {
        System.out.println("私有的构造方法   年龄：" + age);
    }

    public void show1(String s) {
        System.out.println("调用了：公有的，String参数的show1(): s = " + s);
    }

    protected void show2() {
        System.out.println("调用了：受保护的，无参的show2()");
    }

    void show3() {
        System.out.println("调用了：默认的，无参的show3()");
    }

    private String show4(int age) {
        System.out.println("调用了私有的并且有返回值的、int参数的show4():age = " + age);
        return "abcd";
    }


    public static void main(String[] args) throws Exception {
        // 1、加载class对象
//		Class clazz = Class.forName("firstMacJava.Student");
        // 2、获取构造方法
//		Constructor[] cons = clazz.getConstructors();
//		Constructor[] consAll = clazz.getDeclaredConstructors();
        // 3、获取公有、无参的构造方法
//		Constructor con = clazz.getConstructor(null);
        // 4、获取私有构造方法，并调用
//		Constructor conPri = clazz.getDeclaredConstructor(Integer.class);
//		System.out.println("getConstructors()得到的都是public修饰的构造方法");
//		for (Constructor constructor : cons) {
//			System.out.println(constructor);
//		}
//		System.out.println("\ngetDeclaredConstructors()得到的都是所有的构造方法");
//		for (Constructor constructor : consAll) {
//			System.out.println(constructor);
//		}
//		System.out.println("-------------------------------");

//		Field[] fields = clazz.getFields();
//		Field[] fields2 = clazz.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field.getType());
//		}
//		for (Field field : fields2) {
//			System.out.println(field);
//		}
//		Student student = (Student)con.newInstance();
//		Field field = clazz.getField("name");
//		field.set(student, "double 11");
//		System.out.println(student.name);

//		Method[] methods = clazz.getMethods();
//		Method[] methods1 = clazz.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
//		for (Method method : methods1) {
//			System.out.println(method.getName());
//		}
//		Method m1 = clazz.getDeclaredMethod("show4", int.class);
//		m1.setAccessible(true);
//		m1.invoke(student,  21);


    }

}
