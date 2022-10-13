package com;

public class DemoTest {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
			try {
				int res = a/b;
			System.out.println("Result "+res);
			}catch(Exception e) {
				//System.out.println("I Take Care");
				//System.out.println(e.getMessage());
				//System.out.println(e.toString());
				e.printStackTrace();
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
