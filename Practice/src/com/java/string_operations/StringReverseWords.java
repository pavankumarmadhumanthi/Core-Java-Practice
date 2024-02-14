package com.java.string_operations;

import java.util.Scanner;

public class StringReverseWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ente the String :");
		String string = sc.nextLine();
		String[] arr = string.split(" ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length() - 1; j >= 0; j--) {

				System.out.print(arr[i].charAt(j));
			}
			if(i<arr.length-1) {
				System.out.print("#");
			}
		}

	}

}
