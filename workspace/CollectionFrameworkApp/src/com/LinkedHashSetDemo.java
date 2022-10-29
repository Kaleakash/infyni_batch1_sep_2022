package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//HashSet lhs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(5);
		lhs.add(1);
		lhs.add(6);
		lhs.add(9);
		lhs.add(4);
		lhs.add(3);
		lhs.add(2);
		System.out.println(lhs);
	}

}
