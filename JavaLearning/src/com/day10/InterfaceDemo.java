package com.day10;


	
	interface Shape{
		int length=10;//no need to specify static or final by default varaiables are static and final in interface 
		
		 static void cicle() {
		 //by default static methods also public ..access modifier not required for static methods
			System.out.println("i am a circle");
			
		}
		  void rectangle();//by default it is public and abstract keyword is optional here we can specify or not no problem in interface
		 
		 default void traingle() {//here we have implemented so it will allow default...default method
			 System.out.println("i am triangle");
		 }
		 
		 
	}
	
	
	
	
	
	
	public class InterfaceDemo implements Shape {
		
   public void rectangle() {
	   System.out.println("i am rectangle");
			
		}
		

	public static void main(String[] args) {
		
		 InterfaceDemo id=new  InterfaceDemo();
		 Shape im=new InterfaceDemo();//both are same
		 id.rectangle();
		 id.traingle();
		 Shape.cicle();
		 

	}

}
