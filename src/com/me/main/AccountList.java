package com.me.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountList {
	private List<Account> accountList;
	private BufferedReader reader;
	public boolean IsComplete =false;

	public AccountList(String location) throws FileNotFoundException {

		this.reader = new BufferedReader(new FileReader(new File(location)));
		accountList = new ArrayList<Account>();
		splitIntoAccounts();
	}

	// Split the file to get each account number
	// Check if any incomplete account numbers

	public void splitIntoAccounts() {
		
		IsComplete = false;
	}
}
