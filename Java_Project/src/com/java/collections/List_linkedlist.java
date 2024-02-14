package com.java.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//having arraylist and vector we are going for linked list because of the modifications are too easy
		//LinkedList<Integer> ll=new LinkedList<>();//it implements both queue and list
		//Deque<Integer> dl=new LinkedList<>();//linkedlist implementing deque
		ArrayList<String> al=new ArrayList<>();
		al.add("riya");
		al.add("suraj");
		al.add("ers");
		List<String> ll=new LinkedList<>();
		ll.add("pavan");
		ll.add("Kumar");
		ll.add(2,"arjun");//index based adding
		ll.addAll(2,al);// we can add any type of colletion object
		ll.remove(1);
		ll.get(0);
		ll.contains("pavan");
		ll.set(0,"ammai");
		System.out.println(ll);
		Collections.synchronizedList(ll);
		//operations are same as list operations
		//
		
		
		

	}

}
