package com.day9;

class A{
	int a=10;
	
	void show() {
		System.out.println(a);
	}
}

class B extends A{
	int b=20; 
	
	void dsiplay() {
		System.out.println(b);
	}
}

class C extends B{
	int c=30; 
	
	void dsiplay() {
		System.out.println(c);
	}
}





public class InheritanceTypes {
	
	

	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.show();
		

	}

}
