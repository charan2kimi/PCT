package com.me.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountList {
	private  List<Account> accountList;
	private BufferedReader reader;
	private boolean isComplete = true;

	public AccountList(String location) throws FileNotFoundException {

		this.reader = new BufferedReader(new FileReader(new File(location)));
		accountList = new ArrayList<Account>();
		splitIntoAccounts();
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public boolean isComplete() {
		return this.isComplete;
	}

	// Split the file to get each account number
	// Check if any incomplete account numbers but do not fail

	public void splitIntoAccounts() {
		String r1, r2, r3, blank;
		try {
			while ((r1 = reader.readLine()) != null) {
				
				if ((r2 = reader.readLine()) != null
						&& (r3 = reader.readLine()) != null) {
					Account account = new Account(r1, r2, r3);

					accountList.add(account);

				} else
					this.isComplete = false;
				
				blank = reader.readLine();// leave out the blank
			}
			if(accountList.size()==0)
				this.isComplete = false;
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
