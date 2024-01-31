package com.Day8;

public class StaticMain {

		public static void main(String[] args) {
			
			System.out.println(StaticExample.a);
			//System.out.println(b);//b cannot be access because it is non static variable can't access in static methods
			StaticExample.m1();
	       // m2();//can't access
	        StaticExample se=new  StaticExample ();//by creating object we can access non static stuff in static methods
	        System.out.println(se.b);
	        se.m2();
	        

		


	}

}
