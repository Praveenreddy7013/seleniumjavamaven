package com.Day8;

public class Account {
	
	private int account_no;
	private String name;
	private double amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void Set_Accountno(int accno) {
		account_no=accno;
		
	}
	public int Get_Accountno() {
		return account_no;
		
	}

}
