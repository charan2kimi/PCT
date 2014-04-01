package com.me.main;

public class Account {

	private String row1, row2, row3, message;
	private boolean isValid = false;
	private StringBuffer accountNumber=new StringBuffer();

	public Account(String row1, String row2, String row3) {
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
		isValid=false;
		message = "Invalid digits found";
		
		
		return "#";
	}

}
