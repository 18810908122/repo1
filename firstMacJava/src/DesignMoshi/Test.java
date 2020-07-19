package DesignMoshi;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
//		AnimalFactory af = new MaleAnimalFatory();
//		Animal animal = af.createDog();
//		animal.eat();
//		

//		int keyHash = "hello".hashCode();
//		
//		String h = Integer.toBinaryString(keyHash);
//		String k = Integer.toBinaryString(keyHash >>> 16);
//		System.out.println(h+"\n"+k);
//		Integer in = (Integer.parseInt(h,2)^ Integer.parseInt(k,2));
//		
//		System.out.println(Integer.toBinaryString(in.intValue()));

//		TreeSet<Integer> tree = new TreeSet<Integer>();
//		tree.add(45);
//		tree.add(34);
//		tree.add(65);
//		tree.add(24);
//		tree.add(38);
//		tree.add(95);
//		tree.add(34);
//		tree.add(12);
//		
//		for (Integer integer : tree) {
//			System.out.println(integer);
//		}

//		TreeSet<String> str = new TreeSet<String>();
//		str.add("hello");
//		str.add("world");
//		str.add("java");
//		str.add("hell");
//		
//		for (String string : str) {
//			System.out.println(string);
//		}

//		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				
//				return 0;
//			}
//
//		});

//		Map<String, String> map = new HashMap<String, String>();
//		System.out.println("put:"+map.put("hello", "world"));
//		System.out.println(map);
//		System.out.println("put:"+map.put("hello", "world2"));
//		System.out.println(map);
//		Test test = new Test();
//		System.out.println(test.tryMethod());

//		Collections.sort(list);

    }

    private static int tryMethod() {
        int a = 10;
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } catch (Exception e) {

        } finally {
            return 40;
        }
//		return a;
    }

//	@Override
//	public int compareTo(String o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
