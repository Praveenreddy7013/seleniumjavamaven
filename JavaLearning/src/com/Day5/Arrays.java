package com.Day5;

public class Arrays {

	public static void main(String[] args) {
		//single dimensional array
		//declare an array
		int a []= new int[6];
		//insert values into array
		a[0]=1;
		a[1]=2;
		//approach2
		//declaration and inserting 
		int b []= {10,2,3,4,5,6};
		//read single value from array
		//System.out.println(a[0]);
		//System.out.println(b[0]);
		//read multiple values from array
		//for(int i=0;i<6;i++) {
			
			//System.out.println(b[i]);
		//}
		// reading values from array using for each loop
		for(int value:b) {
			System.out.println(value);
		}
		//find size of array
		System.out.println(a.length);
		System.out.println(b.length);
		
		
	}

}
