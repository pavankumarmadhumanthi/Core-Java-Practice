package com.example;

import java.util.Scanner;

public class FebnociiSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		System.out.println("enter the no of values u want:");
		int value=new Scanner(System.in).nextInt();
		for(int i=0;i<value;i++) {
			
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		
		}
	}

}
