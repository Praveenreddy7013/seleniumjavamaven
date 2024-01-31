package com.day12;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//declaration(always go with first approach because itself we will know what is type of key&value
		//HashMap <Double,String> hm= new HashMap<Double,String>();//if we have all sets of data with double and string values as key values we can declare like this
		HashMap hm=new HashMap();
		//adding pairs(key&value) to hashmap
		hm.put(101, "anil");//here we don't have add method ..we have put method
		hm.put(101, "prakash");//if i give same key..old value will be replaced with new value.but entry will be only one entry in hasmap
		hm.put(102, "kumar");
		hm.put(104, "david");//insertion order is not possible
		hm.put(103, "david");
		System.out.println(hm);
		
		//remove specific pair from hashmap
		hm.remove(102);//herw we have to specify key becuase we don't have index concept here so
		System.out.println(hm);
		//print only keys from hashmap
		System.out.println(hm.keySet());//it will print only keys in form of set
		//but if we want to get only values we have to write looping statement
		for(Object k:hm.keySet()) {
			System.out.println(hm.get(k));
		}
		//retrieve/extract specific value by passing key
				System.out.println(hm.get(104));
				
				//print keys along with values not in form of set
				for(Object k:hm.keySet()) {
					System.out.println(k+"   "+hm.get(k));
				}
				
				//print only keys individually one by one
				for(Object k:hm.keySet()) {
					System.out.println(k);
				}
				
		

	}

}
