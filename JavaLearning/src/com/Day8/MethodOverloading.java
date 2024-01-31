package com.Day8;

public class MethodOverloading {
	
	int a,b,c;
	double d;
	
	
	void add(int x, int y) {
		a=x;
		b=y;
		System.out.println(x+y);
		
	}
    void add(int x, int y,int z) {
	a=x;
	b=y;
	c=z;
	System.out.println(x+y+z);
		
	}
  double add(int x, int y, double w) {
	a=x;
	b=y;
	d=w;
	return x+y+w ;
  }
	

	
	

	public static void main(String[] args) {
		
		
		MethodOverloading mo=new MethodOverloading();
		mo.add(60, 20);
		mo.add(60, 30, 20);
		mo.add(20, 30, 10);
	

	}

}
