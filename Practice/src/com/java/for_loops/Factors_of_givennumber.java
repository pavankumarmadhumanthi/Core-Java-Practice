package com.java.for_loops;

import java.util.Scanner;

public class Factors_of_givennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		System.out.println("the factors of given number :");
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
