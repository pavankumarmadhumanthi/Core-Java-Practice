package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Seperate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in 0's ans 1's :");
		String s = sc.nextLine();
		char[] ct = s.toCharArray();

		for (int i = 0; i < ct.length; i++) {
			for (int j = i + 1; j < ct.length; j++) {
				if (ct[i] >= ct[j]) {
					char temp = ct[i];
					ct[i] = ct[j];
					ct[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ct));
	}

}
