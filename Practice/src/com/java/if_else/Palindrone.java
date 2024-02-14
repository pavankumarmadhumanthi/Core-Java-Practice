package com.java.if_else;

import java.util.Scanner;

public class Palindrone {
	public static boolean isPalindrone(String text) {
		int i = 0;
		int j = text.length() - 1;
		while (i < j) {
			if (text.charAt(i) != text.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String text= sc.next();
		if (isPalindrone(text)) {
			System.out.println("Given string is palindrome");

		} else {
			System.out.println("given String is not palindrine");
		}

	}

}
