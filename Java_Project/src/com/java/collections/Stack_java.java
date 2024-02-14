package com.java.collections;

import java.util.Stack;

public class Stack_java {
	public static void main(String[] args) {
		Stack<String> sk=new Stack<>();
		sk.add("Red");
		sk.add("Black");
		sk.add(2,"white");
		System.out.println(sk.contains("white"));
		System.out.println(sk);
		sk.push("pavan");
		sk.push("Kumar");
		sk.push("Kumar");
		sk.push("Kumar");
		sk.push("arjun");
		System.out.println( sk.peek());
		System.out.println(sk.pop());
		System.out.println(sk.search("white"));
		System.out.println(sk);
		
			
		}
		
		
	}
