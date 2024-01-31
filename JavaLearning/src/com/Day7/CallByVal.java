package com.Day7;
  class Cal{
	int x;
	void add(int a) {
		x=a+5;
	}
	
}


  
  
  public class CallByVal {
	
	public static void main(String[] args) {
		Cal c=new Cal();
		int x=10;
		c.add(x);
		System.out.println(x);

	}

}
