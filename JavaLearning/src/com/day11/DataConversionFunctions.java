package com.day11;

public class DataConversionFunctions {

	public static void main(String[] args) {
		/*String s="12345";
		System.out.println(s.getClass().getName());
		Integer a=Integer.parseInt(s);//convert string into number..this is the method
		System.out.println(a);
		System.out.println(a.getClass().getName());//type of number*/
		
		int c=123;
		String s=String.valueOf(c);//this will convert any type,,,here u can pass int, float,double anything it will convert to string
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		//string to double
		String e= "madhu";//it must be in this format then only we can convert to double
		
		Double d=Double.parseDouble(e);
		System.out.println(d);
		System.out.println(d.getClass().getName());
		
		//double to string
		double r=120.30;
		String n=String.valueOf(r);
		System.out.println(n);
		System.out.println(n.getClass().getName());
		
	
		
		
		
		
		
		

	}

}
