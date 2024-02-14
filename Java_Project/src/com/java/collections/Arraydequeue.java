package com.java.collections;

import java.util.*;

public class Arraydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraydeque is 2 sided queue ,in priority queue we add from tail and remove from head
		//but in arraydeque deletion and insertion in both sides
		
		ArrayDeque<String> ad=new ArrayDeque<>();
		//addition-offer,offerFirst,offerLast,add,addLast,addFirst
		ad.add("apple");
		ad.addFirst("orange");
		ad.addLast("pineapple");
		ad.offer("banana");
		
		
		//retrival-peek,peekFirst,peekLast
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		//removal-poll,pollFirst,pollLast,remove,removeFirst,removeLast
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		
		

	}

}
