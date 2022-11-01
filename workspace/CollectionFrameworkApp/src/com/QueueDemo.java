package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	//List ll = new ArrayList();
	Queue qq1 = new PriorityQueue();
	qq1.add(3);
	qq1.add(2);
	qq1.add(6);
	qq1.add(8);
	qq1.add(5);
	Queue qq2 = new LinkedList();
	qq2.add(3);
	qq2.add(2);
	qq2.add(6);
	qq2.add(8);
	qq2.add(5);
	System.out.println(qq1);
	System.out.println(qq2);
	System.out.println(qq1.poll());   // it remove first element 
	System.out.println(qq2.poll());   // it remove first element
	System.out.println(qq1);
	System.out.println(qq2);
	}

}
