package com.day10;

abstract class Animal{
	
	abstract void eat(); //abstarct method/unimplemented method
	void run() {  //non abstarct method
		System.out.println("run fast...");
	}
	
	static void waik() {//static method
		System.out.println("waiking");
	}
	
	Animal()//constructor
	{
		System.out.println("this is constructor");
		
	}
		
	
	
}
class Horse extends Animal{
	
	void eat() {
		System.out.println("horse eat grass");
	}
	
	
	
}
public class AbstarctClassDemo {

	public static void main(String[] args) {
		
		Horse h=new Horse();//invoking cconstructor
		h.eat();//invoking abstrcat method
		h.run();//invoking non abstarct method
		Animal.waik();//invoking static methd
		

	}

}
