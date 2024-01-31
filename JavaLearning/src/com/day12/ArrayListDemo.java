package com.day12;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration of arraylist
		
		ArrayList al=new ArrayList();
		
		//add elemnts into arraylist
		al.add(2);;
		al.add(10.5);
		al.add("praveen");
		al.add(false);
		al.add(null);
		al.add(null);
		//size of arraylist
		System.out.println(al.size());
		//display all values from arraylist in the form of set
		System.out.println(al);//insertion order is preserved same order we got in output..
		
		//remove element from the arraylist
		al.remove(4);//we need to pass index here
		System.out.println(al);
		//add new value somewhere in middle of arraylist...inserting elements in middle of list
		al.add(3, 1);
		System.out.println(al);
		//retrieve/read specific value from arraylist
		System.out.println(al.get(2));
		//read multiple/all values from list individually one after another..using enhanced for loop
		
		/*for( Object element:al) {
			System.out.println(element);
		}*/
		
		//using normal for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//clear all values from arraylist
		
		al.clear();
		System.out.println(al);
		
		
		
	

	}

}
