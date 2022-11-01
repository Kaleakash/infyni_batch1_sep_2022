package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack ss = new Stack();
		ss.push(100);				// it is use to add the element 
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println("Size "+ss.size());
		System.out.println(ss);
		System.out.println("Last element "+ss.peek()); // this method display top most element 
		System.out.println(ss);
		System.out.println("Remove top most element "+ss.pop()); // it will display and remove the top most element 
		System.out.println(ss);
		if(ss.search(3000)<0) {
			System.out.println("element not present");
		}else {
			System.out.println("element present");
		}
	}

}
