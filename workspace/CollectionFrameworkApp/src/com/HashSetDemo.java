package com;

import java.util.HashSet;
class A {}
class B {}
public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet hs = new HashSet();
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		hs.add(100);
////		int a=101;		// primitive value;
////		Integer b = new Integer(a);		// conveting primitive to object 
////		hs.add(b);			
//		hs.add(102);		// auto-boxing : converting primitive to object. 
//		hs.add(10.10);
//		hs.add(true);
//		hs.add("Ravi");
//		A obj1 = new A();
//		B obj2 = new B();
//		hs.add(obj1);
//		hs.add(obj2);
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		System.out.println(hs);		// it is consider as string 
		
		HashSet hs = new HashSet();
		hs.add(3);
		hs.add(1);
		hs.add(6);
		hs.add(5);
		hs.add(9);
		hs.add(4);
		hs.add(11);
		hs.add(19);
		System.out.println(hs);
		System.out.println("Search "+hs.contains(3));
		System.out.println("Search "+hs.contains(30));
		System.out.println("Remove "+hs.remove(6));
		System.out.println("Remvoe "+hs.remove(10));
		System.out.println(hs);
		hs.clear();   
		System.out.println("Size "+hs.size());
		System.out.println(hs);
	}

}
