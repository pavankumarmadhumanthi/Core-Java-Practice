package com.Arrays;

import java.util.Scanner;

public class SumofPairsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				if (arr[i] + arr[j] == 5) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}

	}

}
