package com.me.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.experimental.theories.Theory;

import com.me.main.AccountList;

public class AccountListTests {
	AccountList list;

	public AccountListTests() {

	}

	@Test(expected = FileNotFoundException.class)
	public void accountList_isValidFile_failsOnInvalidInput()
			throws IOException {
		list = new AccountList("garbage");

	}

	@Test
	public void accountList_isValidFile_passesOnValidInput() throws FileNotFoundException{
		list = new AccountList("src/resources/testInput.txt");

	}

	@Test
	public void accountList_splitIntoAccounts_failsOnIncompleteInput()
			throws IOException {
		list = new AccountList("src/resources/invalidInput.txt");
		assertFalse(list.IsComplete);

	}

	
}
