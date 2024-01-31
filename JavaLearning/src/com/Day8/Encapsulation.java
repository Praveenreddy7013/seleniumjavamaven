package com.Day8;

public class Encapsulation {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.Set_Accountno(1000000);
		acc.setName("praveen");
		acc.setAmount(20000);
		System.out.println(acc.Get_Accountno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		

	}

}
