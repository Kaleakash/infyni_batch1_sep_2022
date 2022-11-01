package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		Map mm1 = new HashMap();
//			mm1.put(2, "Ravi"); 
//		mm1.put(1, "Raju"); 
//		mm1.put(4, "Vijay"); 
//		mm1.put(6, "Ajay");
//			mm1.put(2, "Seeta");  
//		mm1.put(3,"Raju");
//		System.out.println(mm1);
//		System.out.println(mm1.containsKey(1));
//		System.out.println(mm1.containsValue("Ajay"));
//		System.out.println(mm1.get(2));
//		System.out.println(mm1.get(10));
		Map mm1 = new HashMap();
		//Map mm1 = new LinkedHashMap();
		//Map mm1 = new TreeMap();
		mm1.put(2, "Ravi"); 
		mm1.put(1, "Raju"); 
		mm1.put("a","LOkesh");
		mm1.put(4, "Vijay"); 
		mm1.put(6, "Ajay");
		mm1.put(2, "Seeta");  
		mm1.put(3,"Raju");
		mm1.put(null, "A");
		mm1.put(10, null);
		mm1.put(null, null);
		System.out.println(mm1);
	}

}
