package com.day10;

interface P1{
	
	int x=10;
	void m1();
	
}

interface P2{
	
	int x=20;
	void m2();
	
}

class M{
	int a =28;
	void s1() {
		System.out.println(a);
	}
}














public class MultipleInheritance extends M implements P1,P2 {
	
	public void m1() {
		System.out.println("i am m1");
	}
	public void m2() {
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
		
		MultipleInheritance mi=new MultipleInheritance();
		mi.m1();
		mi.m2();
		mi.s1();
		

	}

}
