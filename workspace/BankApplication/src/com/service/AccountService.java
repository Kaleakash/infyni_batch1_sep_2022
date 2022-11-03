package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Account;

public class AccountService {
		List<Account> accounts = new ArrayList<Account>();
		
		public String createAccount(Account account) {
			int flag = 0;
			if(accounts.size()==0) {
				accounts.add(account);
				return "Account created successfully";
			}else {
				Iterator<Account> li = accounts.iterator();
				while(li.hasNext()) {
					Account acc = li.next();
					if(acc.getAccno()==account.getAccno()) {
						flag++;
						break;
					}
				}
			}
			
			if(flag>0) {
				return "Account number exists";
			}else {
				accounts.add(account);
				return "Account created successfully";
			}
		}
		
		public List<Account> getAllAccountDetails() {
			return accounts;
		}
}
