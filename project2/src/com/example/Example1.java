package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
	
	Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
	
	String s="apple";
	char[] charArray = s.toCharArray();
	
	for(Character i:charArray) {
		if(hashMap.containsKey(i)) {
			Integer integer = hashMap.get(i);
			hashMap.put(i, integer+1);
		}else {
			hashMap.put(i,1);
		}
	}
	System.out.println(hashMap);
	

	
}
}
