package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPIExample {

	public static void main(String[] args) {
	List<String> names = Arrays.asList("Ravi","Ramesh","Lokesh","Mahesh","Ajay","Vijay");
	System.out.println(names.size());
	// old way
	int count =0;
	Iterator<String> ii = names.iterator();
	while(ii.hasNext()) {
		String name = ii.next();
		if(name.contains("e")) {
			count++;
		}
	}
	System.out.println("Names are start with c character"+count);
	
	
	// using stream API 
	long cc = names.stream().filter(n->n.contains("e")).count();
	System.out.println("name are contains e character "+cc);
	}

	
}
