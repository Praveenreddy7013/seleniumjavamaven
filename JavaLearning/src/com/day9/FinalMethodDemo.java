package com.day9;


class Temp{
	final void m1() {
		System.out.println("this is m1 method");
	}
}

class TempChild extends Temp{
	void m1() {  //incorrect method because m1 is final method in parent classes
		System.out.println("this is m1 override method");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
