package com.day9;

class Parent {
	
	void display(int a) {
		System.out.println( a);
	}
	
}

class Child1 extends Parent{
	
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent{
	
	void highlight(int c) {
		System.out.println(c);
	}
}












public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child2 c2= new Child2();
		c2.display(10);
		c2.highlight(30);
		Child1 c1= new Child1();
		c1.display(40);
		c1.show(50);
		
		

	}

}
