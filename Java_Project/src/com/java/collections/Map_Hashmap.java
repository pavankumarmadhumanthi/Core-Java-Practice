package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashmap=new HashMap<>();
		hashmap.put(101,"pavan");
		hashmap.put(104,"kumar");
		hashmap.put(105,"Akhil");
		hashmap.put(103,"Arjun");
		hashmap.put(102,"Sandeep");
		
		System.out.println(hashmap);
		//map interface does not support the iterator directly 
		//entrySet will give us the set of entities ,set supports the iterator
		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			
			if(entry.getKey()==104) {
				System.out.println( hashmap.remove(entry.getKey()));
			}
			
		}
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		System.out.println(hashmap.containsKey(105));
		System.out.println(hashmap.containsValue("pavan"));
		System.out.println(hashmap.remove(105));

	}

}
