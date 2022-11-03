package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// collection framework without generics 
//	List ll = new ArrayList();
//	ll.add(100);		// auto-boxing 
//	ll.add(100.20);
//	ll.add("Ravi");
//	ll.add(true);
//				
//	Object obj = ll.get(2);
//	Integer  i = (Integer)obj;		// down level type casting 
//	int n = i.intValue();
//	System.out.println(n);
	//  Collection Framework with generics 
	List<Integer> ll = new ArrayList<Integer>();
	List<Integer> ll1 = new ArrayList<Integer>();
	List<Object> ll3 = new ArrayList<Object>();
	ll1.add(1);
	ll1.add(2);
	ll.add(10);				// auto-boxing : converting int to Integer 
	ll.add(20);
	ll.add(30);
	ll.addAll(ll1);
	List<String> ll2 = new ArrayList<String>();
	//ll.add(10.10);
	System.out.println(ll);
	int n = ll.get(0);		// autounboxing : converting object to primitve 
	System.out.println(n);
	}

}
