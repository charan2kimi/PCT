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
	public void account_isValid_returnsFalseOnIncompleteEntry(){
		
		Account temp=new Account("    _  _     _  _  _  _  _ ","  | _| _||_||_ |_   ||_||_|","");
		assertFalse(temp.isValid());
	}
	
	@Test
	public void account_isValid_returnsFalseOnInvalidDigit(){
		
		Account temp=new Account("U   _  _     _  _  _  _  _ ","  | _| _||_||_ |_   ||_||_|","  ||_  _|  | _||_|  ||_| _|");
		assertFalse(temp.isValid());
	}
	@Test
	public void account_isValid_returnsTrueOnValidNumber(){
		
		Account temp=new Account("    _  _     _  _  _  _  _ ","  | _| _||_||_ |_   ||_||_|","  ||_  _|  | _||_|  ||_| _|");
		assertTrue(temp.isValid());
	}
	

}
