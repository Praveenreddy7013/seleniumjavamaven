package com.Day8;

public class ThisKeywordExample {
	
	int x,y;//global/instance/class variables
	
	void getdata(int x ,int y) //local variables 
	{
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		//access those variables from main method through object
		ThisKeywordExample th=new ThisKeywordExample();
		th.getdata(100, 200);
		th.display();

	}

}
