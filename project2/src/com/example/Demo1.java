package com.example;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		
		Set<String> hashSet = new TreeSet<>();
		hashSet.add("apple");
		hashSet.add("orange");
		hashSet.add(null); // This is allowed in HashSet
		//Stream<String> stream = hashSet.stream();
		//stream.forEach(e->System.out.println(e));

	}

}
