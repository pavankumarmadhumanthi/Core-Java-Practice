package com.example;

import java.util.Arrays;
import java.util.List;

public class Java8practice {
	public static void main(String[] args) {
		
			List<Integer> list
			=Arrays.asList(100,200,120,460,343,100);
			list.stream().filter(e -> e>300).findFirst().ifPresent(e->System.out.println(e));
	}

}
