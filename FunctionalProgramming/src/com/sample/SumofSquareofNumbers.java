package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumofSquareofNumbers {
	
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		numbers.add(9);
		numbers.add(23);
		numbers.add(1);
		numbers.add(35);
		numbers.add(92);
		List<Integer> collect = numbers.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(collect2);
		List<Integer> collect3 = numbers.stream().filter(e -> e==5).collect(Collectors.toList());
		System.out.println(collect2);
		
	}

}
