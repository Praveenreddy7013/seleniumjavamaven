package com.Day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a =40,b=20;
		//arithmetic operators
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//will return always quotient value
		System.out.println(a%b);//will return always remainder value
		//relational operators
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		//logical operators
		boolean x =true;
		boolean y = true;
		System.out.println(x && y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		//increment or decrement operators
		int res =a++;
		int output = --b;
		System.out.println(res);
		System.out.println(output);
		//System.out.println(++a);
		//System.out.println(--a);
		
		
		
				
	}

}
