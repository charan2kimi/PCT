package com.me.main;

public class Account {

	private String row1, row2, row3, message;
	private boolean isValid;
	private StringBuffer accountNumber;
	
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
		this.row1 = row1;
		this.row2 = row2;
		this.row3 = row3;
		parse();
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
		
		switch (graph) {
		case ZERO:
			return "0";
		case ONE:
			return "1";
		case TWO:
			return "2";
		case THREE:
			return "3";
		case FOUR:
			return "4";
		case FIVE:
			return "5";
		case SIX:
			return "6";
		case SEVEN:
			return "7";
		case EIGHT:
			return "8";
		case NINE:
			return "9";
		
			

		default:
			isValid=false;
			message="Invalid Digit Encountered";
			return "#";
		}
		
	}

}
