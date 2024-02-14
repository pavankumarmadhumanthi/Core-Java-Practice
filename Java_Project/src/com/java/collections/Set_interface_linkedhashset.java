package com.java.collections;

import java.util.*;

public class Set_interface_linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedHashset will maintain insertion order
		//linkedHasMap` internally uses hashMap 
		LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
		//adding data
		lhs.add(23);
		lhs.add(45);
		lhs.add(47);
		lhs.add(56);
		lhs.add(21);
		System.out.println(lhs);
		//removing data
		lhs.remove(21);//value not a value
		lhs.contains(45);
		for(Integer i:lhs) {
			System.out.println(i);
		}

	}

}
