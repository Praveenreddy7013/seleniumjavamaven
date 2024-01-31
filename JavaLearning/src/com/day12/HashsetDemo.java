package com.day12;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		//declaration
	//	HashSet<String> hs= new HashSet<String>();//only homoginous data is allowed
		
		Set hs=new HashSet();//heterogenius data is allowwed
		
		//add values
		hs.add(2);
		hs.add(2);//duplicates not allowed
		hs.add("kumar");
		hs.add(10.5);
		hs.add(null);//multiple null values not allowed
		hs.add(null);
		System.out.println(hs);
		hs.add(4);//insertion order is not preserved..index is not allowed here so we can't add values in middle of hashset like arraylist
		System.out.println(hs);
		//hs.add(3,"reddy");//it will throw error because we cannot insert..no insertion is possible in hashset
		hs.remove(10.5);//we have to directly specify the value whichevr we want to remove because we don't have index concept here
		System.out.println(hs);
		//clear the hashset
		
		//retieve the specific value
		//hs.get//we don't have get method here because there iss no index concept here..so it is not possible
		
		//search element is present in hashset or not
		System.out.println(hs.contains("kumar"));
		//is empty
		System.out.println(hs.isEmpty());
		
		//read all values by using enhanced for looop
		
		for(Object element:hs) {
			System.out.println(element);
			
		}
		
		

	}

}
