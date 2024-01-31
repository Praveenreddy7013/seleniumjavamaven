package com.Day7;

public class MethodExample {
	
	int x=10;
	int y=20;
	//(1)no params..no return
	void add() {
	System.out.println(x+y);
	}
	//(2)no params..return value
	int mul() {
		return x*y;
		}
	//3 parameters and no return value
	void sub(int a, int b) {
		System.out.println(a-b);
	}
	//4 parameters and return value
	int div(int c, int d) {
		return c/d;
	}
	
	
	
	

	public static void main(String[] args) {
		MethodExample me=new MethodExample();
		me.add();
		int output= me.mul();
		System.out.println(output);
		me.sub(200, 100);
		int output2=me.div(300, 100);
		System.out.println(output2);

	}

}
