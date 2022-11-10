package com.bank.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bank.bean.*;

public class AccountService {
	
	List<Account> listOfAccount = new ArrayList<Account>();	
	// class which help to 
	// collection of account class object. 
	
	
	public String createAccount(Account account) {	//accno,name,amount 
		// coding.......
		int flag=0;
		if(listOfAccount.size()==0) {
			listOfAccount.add(account);
			return "Account created successfully";
		}else {
			Iterator<Account> ii = listOfAccount.iterator();
			while(ii.hasNext()) {
				Account acc= ii.next();
				if(acc.getAccno()==account.getAccno()) {
					flag++;
					break;
				}
			}
		}
		
		if(flag>0) {
			return "Account can't create becuase account number must be unique";
		}else {
			listOfAccount.add(account);
			flag=0;
			return "Account created successfully";
		}
	}
	
	public String getAccountBalance(int accno) {
		Account myAcc = null;
		
		Iterator<Account> ii = listOfAccount.iterator();
		while(ii.hasNext()) {
			Account acc= ii.next();
			if(acc.getAccno()==accno) {
				myAcc=acc;	
			}
		}
		
		if(myAcc==null) {
			return "There is no account details available with accno as "+accno;
		}else {
			return "Your account balance is "+myAcc.getAmount();
		}
		
	}
	
	public String withdraw(Account account) {
		// coding...
		return null;
	}
	public String deposite(Account account) {
		// coding...
		return null;
	}
}
