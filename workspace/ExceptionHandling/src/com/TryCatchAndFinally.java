package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a=10/1;
			System.out.println(" a is "+a);
			System.out.println(" no exception ");
		}catch (Exception e) {
			System.out.println("catch block "+e);
		}finally {
			System.out.println("finally block");
		}
		System.out.println("normal statement");
	}

}
