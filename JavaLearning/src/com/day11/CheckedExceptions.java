package com.day11;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		Thread.sleep(5000);//unhandled exception type interrupted exception
		System.out.println("program is completed");
		System.out.println("program is finished");
		

	}

}
