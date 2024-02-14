package com.java.Switch_case;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_format_checking {
	public static boolean isValid(String filename) {
		List<String> arr = new ArrayList<>();
		arr.add(".txt");
		arr.add(".pdf");
		arr.add(".png");
		arr.add(".exe");
		int index = filename.lastIndexOf(".");
		String substring = filename.substring(index, filename.length());
		if (arr.contains(substring)) {
				return true;
			}
		

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the filename");
		String filename = sc.next();
		if (isValid(filename)) {
			System.out.println("Given file format is valid !");

		} else {
			System.out.println("given file format is not valid !");
		}

	}

}
