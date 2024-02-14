package com.java.for_loops;

import java.util.Scanner;

public class IsPrime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.printf("given number %d is Prime number", n);
		} else {
			System.out.println("Given number is not a prime number :");
		}
		sc.close();

	}
	

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n > 1) {
			int flag = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					flag = flag + 1;
				}

			}
			if (flag == 2) {
				return true;
			}
		}
		return false;
	}

}
