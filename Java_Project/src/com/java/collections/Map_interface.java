package com.java.collections;

import java.util.*;

public class Map_interface {

	public static void main(String[] args) {
		// why do we use map interface
		//in list interface during retrieving data we need index and  iterate le list -time waste
		//
		Map<Integer,String> m =new Hashtable<>();
		//addition of elements to the map
		m.put(531026,"vaddadhi");
		m.put(531028,"Cheedikada");
		m.put(530041, "Kommadi");
		//Retrival of keys from map
		Set<Integer> keys=m.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		System.out.println(" ");
		Collection<String> values=m.values();
		for(String value:values) {
			System.out.println(value);
		}
		System.out.println(" ");
		//Retrval of vaue using keys
		System.out.println(m.get(531026));
		System.out.println(" ");
		//to get entire key based values
		System.out.println(m);
		
		

	}

}
