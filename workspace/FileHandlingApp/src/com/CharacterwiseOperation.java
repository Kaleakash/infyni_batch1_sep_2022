package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterwiseOperation {

	public static void main(String[] args) {
	try {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("Enter the salary");
		float salary = Float.parseFloat(br.readLine());
		System.out.println("your id is "+id);
		System.out.println("your name is "+name);
		System.out.println("your salary is "+salary);
	} catch (Exception e) {
		System.out.println(e);
	}

	}

}
