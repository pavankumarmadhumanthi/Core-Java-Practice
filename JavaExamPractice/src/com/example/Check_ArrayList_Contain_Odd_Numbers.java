package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check_ArrayList_Contain_Odd_Numbers {
	public static void main(String[] args) {
	List<Integer> of = List.of(1,2,3,3,5,5,67,76);
	List<Integer> collect = of.stream().filter(e->e%2!=0).collect(Collectors.toList());
	System.out.println(collect);
	for(Integer i:of) {
		if(i%2!=0) {
			System.out.println("list contain odd numbers");
			break;
		}
	}
	//boolean anyMatch = of.parallelStream().anyMatch(e->e%2!=0);
}
}