package com;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		//LinkedHashSet ts = new LinkedHashSet();
		ts.add(10);
		ts.add(1);
		ts.add(6);
		ts.add(8);
		ts.add(5);
		ts.add(3);
		ts.add(12);
		ts.add(18);
		//ts.add("Ravi");
		System.out.println(ts);
		System.out.println(ts.headSet(5));
		System.out.println(ts.tailSet(6));
		System.out.println(ts.subSet(5, 10));
	}

}
