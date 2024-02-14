package com.java.collections;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generics 
		ArrayList<Integer> al=new ArrayList<>();
		//bydefault arraylist is not synchronized
		//we can make it synchronized
		
		Collections.synchronizedList(al);
		System.out.println(al);
		Random random=new Random();
		al.add(34);
		System.out.println(al.size());
		al.add(33);
		for(int i=0;i<20;i++) {
			al.add(random.nextInt(100));
		}
		int sum=0;
		for(int i=0;i<20;i++) {
			System.out.print(al.get(i) +" ");
			sum=sum+al.get(i);
		}
		System.out.println("\n");
		System.out.println(sum);
		
		
		ArrayList<Integer> one=new ArrayList<>();
		ArrayList<Integer> two=new ArrayList<>();
		one.add(1);
		one.add(3);
		
		two.add(1);
		two.add(3);
		two.add(7);
		two.add(8);
		two.add(8);
		two.add(11);
		two.forEach(e->System.out.print(e+" "));
		System.out.println(one.indexOf(1));
		
		
		System.out.println(one);
		
		System.out.println(two);
		System.out.println( two.contains(one));

	}

}
