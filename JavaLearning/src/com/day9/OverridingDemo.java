package com.day9;

class Bank{
	double roi() {
		return 0;
	}
}

class Icici extends Bank{
	double roi() {
		return 10.5;
	}
	
}

class Axis extends Bank{
	double roi() {
		return 12.5;
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Icici ic= new Icici();
		System.out.println(ic.roi());
		Axis ax=new Axis();
		System.out.println(ax.roi());

	}

}
