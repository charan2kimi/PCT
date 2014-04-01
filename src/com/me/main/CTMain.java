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
		AccountList list;
		System.out.println("Enter file location:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		list = new AccountList(br.readLine());
		if(!list.IsComplete)
			System.out.println("Incomplete file");
		
		System.out.println(list);
	}

}


