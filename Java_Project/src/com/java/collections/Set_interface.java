 package com.java.collections;
 import java.util.*;
 

public class Set_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set is a data structure to store multiple elements of data
		//in list and queue it dont check whether the data is inside that and simply stores values
		//it allows only unique elements of data its don't allow duplicate values,it dont add duplite simply skip
		//set doesnt contain updation only remove and add
		
		//Hashset internally uses hashMap and hashmap internally uses hash table
		//adding values internally acts key for hashMap and dummy obj is placed in value place
		//when you creat hashmap and asking for keys it return set
		HashSet<Integer> hs= new HashSet<>();
		//adding data
		hs.add(23);
		hs.add(45);
		hs.add(47);
		hs.add(56);
		hs.add(21);
		System.out.println(hs);
		//removing data
		hs.remove(21);//value not a value
		hs.contains(45);
		for(Integer i:hs) {
			System.out.println(i);
		}
		//these all methods are same linkedhashset and tree set but internal implementation is different 
		
	}

}
