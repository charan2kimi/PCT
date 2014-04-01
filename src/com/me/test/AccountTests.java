package com.me.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.me.main.*;

public class AccountTests {
	Account account;

	public AccountTests() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		
		//AccountList list= new AccountList("src/resources/testInput.txt"); 
		//this.account = list.getAccountList().get(0);
					}
	
	@Test
	public void account_isValid_failsOnIncompleteEntry(){
		
		Account temp=new Account("  _  _     _  _  _  _  _","  | _| _||_||_ |_   ||_||_|","");
		assertFalse(temp.isValid());
	}

}
