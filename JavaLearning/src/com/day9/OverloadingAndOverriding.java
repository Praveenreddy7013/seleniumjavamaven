package com.day9;

class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
	
}
class XYZ extends ABC{
	void m1(int a) {
		System.out.println(a*a);//changed the implementation/body of method..overriding achieved in inheritance
	}
	void m2(int a, int b) {//overloading achieved in inheritance too
		System.out.println(a+b);
		
	}
}

public class OverloadingAndOverriding {

	public static void main(String[] args) {
		XYZ obj=new XYZ();
		obj.m1(30);
		obj.m2(20);
		obj.m2(10, 20);

	}

}
