package com.me.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class AccountList {
	private List<Account> accountList;
	private BufferedReader reader;
	public AccountList(String location) throws FileNotFoundException {
		
		this.reader= new BufferedReader(new FileReader(new File(location)));
		
		parse(this.reader);
	}
	
	// Parse the file to get each account number
	private void parse(BufferedReader reader){
		
	}
}
