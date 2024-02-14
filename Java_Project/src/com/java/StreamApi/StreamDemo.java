package com.java.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(2,3,4,7,8,5,9,10);
		asList.stream()
		//filter is intermediate operator in stream api to 
		//perform some operations on the stream
		//it supports predicate in stream
		.filter(e->e%2==0)
		//map is also a intermediate operator in the stream 
		//it is function type
		.map(e->e*10)
		//forEach() method is a terminal operator in stream api
		//and foreach is consumer
		.forEach(e->System.out.println(e));
		
		

	}

}
