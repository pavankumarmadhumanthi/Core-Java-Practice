package com.java.collections;
import java.util.*;


public class Queue_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a queue is linear data structure that followa lifo
		//Queue is data structure is introduced to store multiple values and follow fifo
		//priority queue and arrayque and linkedList implenting queue
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//adding elements to the priority queue
		pq.offer(23424);
		System.out.println( pq.peek());
		pq.add(3453);
		pq.add(34353);
		System.out.println(pq);
		//removing elements from priorty queue
		System.out.println(pq.poll());//remove
		//retrieval of head element
		System.out.println(pq.peek());
		
	}
}
