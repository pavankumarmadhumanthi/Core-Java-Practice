package com.java.for_loops;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get multiplication :");
		int n=sc.nextInt();
		for(int i=0;i<=20;i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}

	}

}
