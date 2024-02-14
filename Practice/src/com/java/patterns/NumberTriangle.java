package com.java.patterns;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
