package com.Day5;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//declaration & this is fixed array we can't store more than 3 rows and 2 columns
		int a[][]=new int[3][2];
		//insert data into array
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		//approach2 of declaration..we can add/remove any no of values later
		int b[][]= {{1,2},{3,4},{5,6}};
		//read single values from array
		System.out.println(b[2][1]);
		//find size of array
		System.out.println("no of rows:"+b.length);
		System.out.println("no of columns:"+b[1].length);
		//read multiple values from array
//		for(int r=0;r<3;r++) 
//		{
//			for(int c=0;c<b[r].length;c++)
//			{
//				System.out.print(b[r][c]+"   -------------------");
//			}
//			System.out.println();
//		}
		//using foreach loop
		for(int v[]:b) 
		{
			for(int x:v)
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}

	}

}
