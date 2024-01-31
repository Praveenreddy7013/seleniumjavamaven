package com.Day8;

public class StaticExample {
	
	static int a=10;//static variable
	int b=20;//non static variable
	
	static void m1()//static method
	{
		System.out.println("this is static method");
	}
	
	void m2() {
		System.out.println("this is non static method" + a );
	}}

/*	public static void main(String[] args) {
		
		System.out.println(a);
		//System.out.println(b);//b cannot be access because it is non static variable can't access in static methods
        m1();
       // m2();//can't access
        StaticExample se=new  StaticExample ();//by creating object we can access non static stuff in static methods
        System.out.println(se.b);
        se.m2();
        

	}

}*/
