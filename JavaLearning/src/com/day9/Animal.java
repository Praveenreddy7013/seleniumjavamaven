package com.day9;

public class Animal {
	
	String colour= "white";
	void eat() {
		System.out.println("eating");
	}
	
	Animal(){
		System.out.println("animal constructor is created");
	}

}
 class Dog extends Animal{
	 String colour= "black";//overided the variable
	 
	 void eat() {
			//System.out.println("eating bread")
		 super.eat();;
		}
		void display() {
			System.out.println(colour);
			System.out.println(super.colour);
		}
		
		Dog(){
			//System.out.println("dog construcotr is created");
			super();
		}
	 
	
}
