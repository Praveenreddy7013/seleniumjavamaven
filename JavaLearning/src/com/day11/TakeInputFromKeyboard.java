package com.day11;

import java.util.Scanner;

public class TakeInputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();//if we want to accept input as number/integer value from console
        System.out.println("entered number is :" +  num );
        System.out.println("Enter a  decimal number : ");
        double num1= sc.nextDouble();//if we want to accept decimal type of data
        System.out.println("entered decimal number is :" +  num1 );
        
        System.out.println("Enter a  string : ");
        String s = sc.next();//if we want to accept string type of data
        System.out.println("entered string is :" +  s );
	
	
	
	
	}
	
	

}
