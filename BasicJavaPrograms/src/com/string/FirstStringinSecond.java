package com.string;

import java.util.Scanner;

public class FirstStringinSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String first = sc.nextLine();
		System.out.println("Enter the second String : ");
		String second = sc.nextLine();
		if (second.length() > first.length()) {
			for (int i = 0; i < first.length(); i++) {
				if (second.contains(first.charAt(i) + "")) {
					int index = second.indexOf(i);

				} else {
					System.out.println("given first string is not present in second String");
					break;
				}

			}

		} else {
			System.err.println("given first string is not present in second String");
		}
	}

}
