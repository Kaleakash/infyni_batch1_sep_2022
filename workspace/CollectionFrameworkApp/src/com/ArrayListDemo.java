package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	System.out.println("Size is "+al.size());
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	System.out.println("Size is "+al.size());
	System.out.println(al);
	System.out.println("element from 1 index position "+al.get(1));
	al.add(1, 1000);
	System.out.println(al);
	System.out.println("element from 1 index position "+al.get(1));
	System.out.println("element from 2 index position "+al.get(2));
	al.remove(2);		// remove element using index position 
	Integer a = 1000;	// auto boxing : converting primitive to object 
	al.remove(a);
	System.out.println(al);
	}

}
