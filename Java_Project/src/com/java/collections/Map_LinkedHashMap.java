package com.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> ll=new LinkedHashMap<>();
		ll.put(101,"akhil");
		ll.put(102,"pavan");
		ll.put(104,"naven");
		ll.put(105,"akhil");
		ll.put(107,"akhil");
		ll.put(109,"arjun");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.toString());
	

	}
	

}
