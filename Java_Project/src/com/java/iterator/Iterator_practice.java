package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_practice {
	public static void main(String[] args) {
		// iterator is interface
		// introduced for iterating the all collection objects
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(342);
		al.add(34);
		al.add(656);
		al.add(55);

		Iterator<Integer> i = al.iterator();
		while (i.hasNext()) {
			i.next();
		}
		System.out.println("==================================");
		ListIterator<Integer> lis = al.listIterator();
		while (lis.hasNext()) {
			int number = lis.next();
			if (number % 2 == 0) {
				lis.remove();
				lis.add(234232);
			}
			
		}
		System.out.println(al);

	}
}
