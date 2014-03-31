package com.me.test;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.experimental.theories.Theory;

import com.me.main.AccountList;

public class FileTests {
	
@Test(expected = FileNotFoundException.class)
public void accountList_isValidFile_failsOnInvalidInput() throws FileNotFoundException{
			new AccountList("garbage");
	
}
@Test
public void accountList_isValidFile_passesOnValidInput() throws FileNotFoundException{
			new AccountList("src/resources/testInput.txt");
	
}
}
