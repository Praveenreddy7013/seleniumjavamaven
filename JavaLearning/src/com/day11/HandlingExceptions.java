package com.day11;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {
		

System.out.println("program is started");
		
		//arithmetic exception
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();//accepting integer value
		try {
		System.out.println(100/num);
		}
		catch(Exception e) {// 
			System.out.println("given invalid input");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
		
		//arrayindexoutofbounds exception
		/*int a[]=new int[5]; //index start from 0 to 4
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("where do u want to insert :");
		int position = sc.nextInt();
		
		a[position]=num;  //here in this line we will get exception if we give position as 6
		System.out.println(a[0]);*/
		
		//numberformatexception
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");//if i pass "abc" in string we can't convert into number..if it has number we can convert
		
		String name = sc.next();
	int num=Integer.parseInt(name);*/
		
		//nullpointerexception
		
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.next();
		System.out.println(s.length());*/
		
		
				
		
	
		
		
		
		
		
		

	}

}

