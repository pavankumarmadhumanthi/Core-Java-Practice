package com.java.patterns;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();

		for (int i = 1; i <= (n + (n-1)); i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			} else {
				for (int j = 1; j <= (n+(n) - i); j++) {
					System.out.print(j);
				}
				System.out.println();

			}

		}

	}
}
