package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Account;
import com.service.AccountService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		AccountService ac = new AccountService();
		int choice;
		String con = "";
		int accno;
		String name;
		float amount;
		String result;
		do {
			System.out.println("1:Create Account 2: Diplay All account details");
			choice = sc.nextInt();
			switch (choice) {
			case 1:	System.out.println("Enter the accno");
			      accno = sc.nextInt();
			      System.out.println("Enter the name");
			      name = sc.next();
			      System.out.println("Enter the amount");
			      amount = sc.nextFloat();
			      Account acc = new Account(accno, name, amount);
			      result =  ac.createAccount(acc);
				  System.out.println(result);
				break;
			case 2: List<Account> listOfAcc= ac.getAllAccountDetails();
						Iterator<Account> li  = listOfAcc.iterator();
						while(li.hasNext()) {
							Account aa = li.next();
							System.out.println("AccNo "+aa.getAccno()+" Name "+aa.getName()+" Amount "+aa.getAmount());
						}				
						break;
			default:	System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		} while (con.equals("y"));
	}

}
