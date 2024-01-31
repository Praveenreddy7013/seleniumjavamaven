package com.Day8;

public class ConstructorOverloading {

	
	ConstructorOverloading(){
		System.out.println("This is default constructor");
		
	}
	ConstructorOverloading(int a){
		System.out.println("This is parameterized constructor"+ a);
	}
	ConstructorOverloading(int a, int b){
		System.out.println("This is parameterized constructor"+" " + (a+b));
	}
	ConstructorOverloading(int a, int b, int c){
		System.out.println("This is parameterized constructor"+" " +(a+b+c));
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading col = new ConstructorOverloading(1,2);
		ConstructorOverloading cold = new ConstructorOverloading(1,2,3);
		

	}

}
