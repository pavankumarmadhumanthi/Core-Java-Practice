package com.string;

import java.util.Scanner;

public class NprimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int n = 2;
		int count = 0;
		while (count <= num-1) {
			boolean value = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					value = false;
					n = n + 1;
					break;
				}

			}
			if (value) {
				System.out.println(n);
				n = n + 1;
				count = count + 1;
			}

		}
	}

}
