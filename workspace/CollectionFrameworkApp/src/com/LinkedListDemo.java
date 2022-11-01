package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println("Size "+ll.size());
		System.out.println(ll);
		ll.add(1, 200);
		System.out.println("element in 1 index positon "+ll.get(1));
		ll.addFirst(1000);
		ll.addLast(2000);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
	}

}
