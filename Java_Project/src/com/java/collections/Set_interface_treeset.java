package com.java.collections;

import java.util.*;

public class Set_interface_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//treeset internally follows treeMap and treeMap follows binary tree
		//treeset maintain sorted order
		//in all sets duplicte values not allowed
		// tree set offer some operations(methods)first(),last(),pollFirst(),and pollLast(),subSet()
		TreeSet<Integer> ts= new TreeSet<>();
		//adding data
		ts.add(23);
		ts.add(45);
		ts.add(47);
		ts.add(56);
		ts.add(21);
		System.out.println(ts);
		//removing data
		ts.remove(21);//value not a value
		ts.contains(45);
		for(Integer i:ts) {
			System.out.println(i);
		}

	}
	

}
