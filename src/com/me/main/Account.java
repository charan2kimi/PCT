package com.me.main;

public class Account {

	private String row1, row2, row3, message;
	private boolean isValid = false;
	

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
	public void parse(){
		
		this.isValid=false;
		this.message="Incomplete Entry";
	}

}
