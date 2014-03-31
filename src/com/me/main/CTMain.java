/**
 * 
 */
package com.me.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Charan
 *
 */
public class CTMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file location:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		AccountList list= new AccountList(br.readLine());
		
		System.out.println(list);
	}

}


