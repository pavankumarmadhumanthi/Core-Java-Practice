package com.java.Patterns;

import java.util.Scanner;

public class Diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n:: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i <= n / 2) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");

				}
				for (int j = 1; j <= ((i * 2) - 1); j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			else { 
				for (int j = 1; j <= n-i; j++) {
					System.out.print(" ");

				}
				for (int j = n; j >=1; j--) {
					System.out.print("*");
				}
				System.out.println(" ");
				
				
			}

		}

	}
}
