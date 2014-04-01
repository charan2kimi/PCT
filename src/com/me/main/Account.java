package com.me.main;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String row1, row2, row3, message;
	private boolean isValid;
	private StringBuffer accountNumber;
	private List<String> number;
	
	private static final String ZERO=" _ | ||_|";
	private static final String ONE="     |  |";
	private static final String TWO=" _  _||_ ";
	private static final String THREE=" _  _| _|";
	private static final String FOUR="   |_|  |";
	private static final String FIVE=" _ |_  _|";
	private static final String SIX=" _ |_ |_|";
	private static final String SEVEN=" _   |  |";
	private static final String EIGHT=" _ |_||_|";
	private static final String NINE=" _ |_| _|";
	
	

	public Account(String row1, String row2, String row3) {
		isValid=true;
		accountNumber=new StringBuffer();
		number=new ArrayList<String>();
		this.row1 = row1;
		this.row2 = row2;
		this.row3 = row3;
		parse();
		validateChecksum();
	}

	public String getMessage() {
		return message;
	}

	public boolean isValid() {
		return isValid;
	}

	public void parse() {

		// Checking if each row has enough chars
		if (row1.length()<27||row2.length()<27 || row3.length()<27) {
			isValid = false;
			message = "Incomplete Account Entry";
			return;
		}
		String d1,d2,d3;
		int i=0;
		while(i<27){
			d1=row1.substring(i, i+3);
			d2=row2.substring(i, i+3);
			d3=row3.substring(i, i+3);
			
			accountNumber.append(getDigit(d1, d2, d3));
			i=i+3;
		}
	}
	private String getDigit(String d1, String d2, String d3){
		
		String graph= d1+d2+d3;
		String digit;
		switch (graph) {
		case ZERO:
			digit = "0";
			break;
		case ONE:
			digit = "1";
			break;
		case TWO:
			digit = "2";
			break;
		case THREE:
			digit = "3";
			break;
		case FOUR:
			digit = "4";
			break;
		case FIVE:
			digit = "5";
			break;
		case SIX:
			digit = "6";
			break;
		case SEVEN:
			digit = "7";
			break;
		case EIGHT:
			digit = "8";
			break;
		case NINE:
			digit = "9";
		break;
			
		default:
			isValid=false;
			message="Invalid Digit Encountered";
			digit = "#";
		}
		//if(!digit.equals("#"))
			number.add(digit);
		return digit;
		
	}
	public boolean validateChecksum(){
		
			return false;
	}
	
	@Override
	public String toString(){
		return accountNumber+"\n"+ (isValid?"VALID":"INVALID")+"\n"+(isValid?"":message);
		
	}

}
