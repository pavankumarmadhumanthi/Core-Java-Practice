package com.example;

import java.util.Scanner;

public class CheckingPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		
		if (num >= 2) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count = count + 1;
				}
			}
			System.out.println(count == 1 ? " prime" : "not prime");

		} else {
			System.out.println("not a prime number");
		}

	}
}
