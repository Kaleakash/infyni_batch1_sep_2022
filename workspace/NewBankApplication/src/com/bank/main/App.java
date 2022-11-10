package com.bank.main;

import com.bank.bean.Account;
import com.bank.service.AccountService;

public class App {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccno(100);
		acc1.setCname("ajay");
		acc1.setAmount(1000);
		
		Account acc2  = new Account(101, "Mahesh", 12000);
		Account acc3  = new Account(102, "Raj", 15000);
		
		AccountService as = new AccountService();
		String result1 = as.createAccount(acc1);
		System.out.println(result1);
		
		String result2 = as.createAccount(acc2);
		System.out.println(result2);

		String result3 = as.createAccount(acc3);
		System.out.println(result3);
		
		String result4 = as.getAccountBalance(103);
		System.out.println(result4);
	}

}
