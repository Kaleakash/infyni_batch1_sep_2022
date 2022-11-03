package com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	int choice;
	String name;
	String con="";
	String result;
	StackOperation so = new StackOperation();
		do {
			System.out.println("1:Push, 2: Pop 3: Search 4: Retreive");
			System.out.println("Plz enter your choice");
			choice =ss.nextInt();
			switch(choice) {
			case 1:System.out.println("Plz enter the name");
			     name = ss.next();
			     result = so.push(name);
			     System.out.println(result);
			     break;
			case 2:System.out.println("Stack Pop operation");
					result = so.pop();
					System.out.println("Element pop from stACK "+result);
					break;
			case 3:System.out.println("Search element from stack");
					System.out.println("Plz enter the name");
					name = ss.next();
			       result = so.search(name);
			       System.out.println(result);
			       break;
			case 4: Stack<String> s  = so.retrive();
					Iterator<String> li = s.iterator();
					while(li.hasNext()) {
						String nn = li.next();
						System.out.println(nn);
					}
					break;
			default :System.out.println("Wrong choice");
			         break;
			}
			System.out.println("do you want to continue?");
			con = ss.next();
		} while (con.equals("y"));
		
		System.out.println("thank you!");
	}

}
