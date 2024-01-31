package com.Day7;

   class Calc{
	   int x;
	   void  add(Calc a) {
		   x=a.x+5;
		   
	   }
   }







public class CallByRef {

	public static void main(String[] args) {
		Calc c= new Calc();
		c.x=10;
		c.add(c);
		System.out.println(c.x);
	}}