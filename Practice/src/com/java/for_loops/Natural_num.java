package com.java.for_loops;


import java.util.Scanner;

public class Natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print the first 10 natural numbers.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of N: ");
		int N = sc.nextInt();
		for(int i=0;i<=N;i++) {
			System.out.print(i+" ");
		}
	}

}
