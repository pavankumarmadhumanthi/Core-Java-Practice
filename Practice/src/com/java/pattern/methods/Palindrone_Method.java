package com.java.pattern.methods;

import java.util.Scanner;

public class Palindrone_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("here program is Started");
		for (int i = 0; i <= 1000; i++) {
			int n = isPalindrone(i);
			if (n == 1) {
				System.out.print(i+" ");
			}

		}

	}

	private static int isPalindrone(int i) {
		// TODO Auto-generated method stub
		int number = i;
		if (number > 0) {
			int sum = 0;
			int rem;
			while (number > 0) {
				rem = number % 10;
				sum = sum * 10 + rem;
				number = number / 10;
			}
			if (sum == i) {
				return 1;
			}

		}

		return 0;
	}

}
