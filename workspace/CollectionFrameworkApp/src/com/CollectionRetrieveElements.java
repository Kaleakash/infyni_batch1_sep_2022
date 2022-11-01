package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionRetrieveElements {

	public static void main(String[] args) {
//	Set ss = new HashSet();
//	ss.add(4); ss.add(5); ss.add(1); ss.add(7); ss.add(3);
//	System.out.println(ss);
//	System.out.println("retrieve the element using for each loop");
//	for(Object a:ss) {
//		System.out.println(a);
//	}
//	System.out.println("Retreive the element using iterator");
//	 Iterator ii = ss.iterator();
//	 while(ii.hasNext()) {
//		 Object obj = ii.next();
//		 System.out.println(obj);
//	 }
//		List ll = new ArrayList();
//		ll.add(10); ll.add(14); ll.add(5); ll.add(6);
//		// we can use for each loop, iterator same way as well as we can use ListIterator 
//		ListIterator li = ll.listIterator();
//		System.out.println("forward direction");
//		while(li.hasNext()) {
//			Object obj = li.next();
//			System.out.println(obj);
//		}
//		System.out.println("backward direction");
//		while(li.hasPrevious()) {
//			Object obj = li.previous();
//			System.out.println(obj);
//		}
		Map mm = new HashMap();
		mm.put(1, "Ravi");
		mm.put(2, "Ramesh");
		mm.put(3, "Lokesh");
		Set ss	= mm.entrySet();	//converting map to set 
		Iterator li = ss.iterator();
		while(li.hasNext()) {
			//Object obj = li.next();
			//System.out.println(obj);
			Map.Entry me = (Map.Entry)li.next();		// converting set to map 
			//System.out.println(me.getKey());
			//System.out.println(me.getValue());
			System.out.println(me.getKey()+"     "+me.getValue());
		}
	}

}
