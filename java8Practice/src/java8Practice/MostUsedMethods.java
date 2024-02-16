package java8Practice;

import java.util.List;

public class MostUsedMethods {
	public static void main(String[] args) {
		List<Integer> elements = List.of(2, 3,7,8,3,6,47,4,6,8);
		int intValue = elements.stream()
		.filter(e->e%2==0)
		.map(e->e*e)
		.reduce(0,(e,c)->e+c)
		.intValue();
		System.out.println(intValue);
		
		
		
	}

}
