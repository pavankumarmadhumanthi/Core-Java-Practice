package com.java.for_loops;

import java.util.Scanner;

public class Fibnocii_serious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of fib_lenght");
		int length=sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(0+" "+1+" ");
		for(int i=2;i<length;i++) {
			int next=first+second;
			first=second;
			second=next;
			
			System.out.print(next+" ");
		}
		

	}

}
