package com.java.string_operations;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the String1 :");
		String string1 = sc.nextLine();
		StringBuffer str1 = new StringBuffer(removeDuplicate(string1));

		System.out.println("ente the String2 :");
		String string2 = sc.nextLine();
		StringBuffer str2 = new StringBuffer(removeDuplicate(string2));
		boolean value = true;

		if (str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {
				if (!string1.contains(String.valueOf(str2.charAt(i)))) {
					value = false;
				}
			}
		} else {
			System.out.print("no");
		}
		if (value && str1.length() == str2.length()) {
			System.out.println("yes");
		}

	}

	private static StringBuffer removeDuplicate(String string) {
		
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				boolean value = true;
				if (String.valueOf(string.charAt(i)) == String.valueOf(string.charAt(j))) {
					
					value = false;
				}
				if (value==false) {
					sb.append(String.valueOf(string.charAt(i)));
				}

			}
		}

		return sb;
	}

}
