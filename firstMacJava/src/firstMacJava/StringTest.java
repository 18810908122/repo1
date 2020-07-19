package firstMacJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class StringTest extends Object {

    public static void main(String[] args) throws FileNotFoundException {
//		String string = new String("aaefds");
//		System.out.println(string.getBytes().length);

//		String string1 = new String("a哈");
//		System.out.println(string1.getBytes().length);

//		string.contains(string1);
//		string.isEmpty();
//		string.equals(string1);
//		string.equalsIgnoreCase(string1);
//		string.length();
//		string.charAt(2);
//		string.indexOf(0);
//		System.out.println(string.substring(2,5));

//		String s1 = "hello";
//		s1 += "world";
//		
//		String s2 = "hello";
//		String s3 = "hello";
//		String s4 = "abcd";
//		String s5 = "xyz";
//		String s6 = "hell";
//		System.out.println(s2.compareTo(s3));
//		System.out.println(s2.compareTo(s4));
//		System.out.println(s2.compareTo(s5));
//		System.out.println(s2.compareTo(s6));
//		StringBuilder sb = new StringBuilder();
//		System.out.println(sb.capacity());

//		StringBuilder sb = new StringBuilder();
//		StringBuilder sb2 = sb.append("hello");
//		
//		System.out.println("sb:"+sb);
//		System.out.println("sb2:"+sb2);
//		System.out.println(sb == sb2);

//		StringBuilder sb = new StringBuilder("hello");
//		String str = new String(sb);
//		System.out.println(str);

//		String s3 = "hellojavahellojava";
//		System.out.println(s3.split("java").length);

//		String str1 = new String("hello");
//		String str2 = new String("world");
//		System.out.println(str1+"---"+str2);
//		change(str1, str2);
//		System.out.println(str1+"---"+str2);
//		
//		StringBuilder sb1 = new StringBuilder("hello");
//		StringBuilder sb2 = new StringBuilder("world");
//		System.out.println(sb1+"---"+sb2);
//		change(sb1, sb2);
//		System.out.println(sb1+"---"+sb2);

//		int[] a = {64,57,86,35,42};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.binarySearch(a, 57));
//		System.out.println(Arrays.binarySearch(a, 32));

//		Integer integer = Integer.valueOf("20");
//		Integer integer2 = Integer.valueOf("30");
//		System.out.println(String.valueOf(integer));

//		System.out.println((integer+integer2));
//		String ss = "594";
//		System.out.println(Integer.parseInt(ss));

//		Integer i = new Integer(6);
//		System.out.println(ii.intValue());

//		String str = "We are happy";
//
//		StringBuffer sb = new StringBuffer(18);
//		System.out.println(sb);
//
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hello", 1);
        map.put("world", 2);
        map.put("java", 3);

//		Student student = new Student();
//		System.out.println(student.hashCode());
//		
//		student.name = "hello+java";
//		Student student1 = new Student();
//		System.out.println(student1.hashCode());
        String string = "hello";
//		System.out.println(string.getBytes().length);
//		System.out.println(string.substring(1));
//		System.out.println(string);
//		String string2 = string + "world";
//		String string3 = "helloworld";
//		String string4 = new String(string)+"world";
//		System.out.println(string2 == string3);

//		int i = Integer.valueOf("1abc");

//		int a = StringTest.fryFinally();
//		System.out.println(a);

//		int[] arr = {1,5,7,8,13,16,17,19,21,35,78};
//		System.out.println(binarySearchLast(arr, 135));

//		int a = 10;
//		FileInputStream fis = new FileInputStream("hello.txt");

//		ConcurrentHashMap<K, V>
    }

    public static int binarySearchLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) left = mid + 1;
            else if (arr[mid] > target) right = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static int fryFinally() {
        try {
            return 0;
        } finally {
            System.out.println("finally");
            return 1;
        }
    }

    public static void change(StringBuilder s1, StringBuilder s2) {
        s1 = s2;
        s2.append(s1);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }
}
