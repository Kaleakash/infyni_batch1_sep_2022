package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String str = "10a";
		try {
			int res1= a/b;
			System.out.println("Result "+res1);
			int res2 = 10/abc[2];
			System.out.println("Result "+res2);
			System.out.println(Integer.parseInt(str));
		}catch(ArithmeticException e) {
			System.out.println(e.toString());		// specific coding 
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());		// specific coding 
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Finish");
	}

}
