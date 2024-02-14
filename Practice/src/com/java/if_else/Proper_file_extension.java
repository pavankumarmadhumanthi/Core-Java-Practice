package com.java.if_else;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proper_file_extension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> extension=new ArrayList<>();
		extension.add(".txt");
		extension.add(".png");
		extension.add(".jpg");
		extension.add(".pdf");
		extension.add(".doc");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename with extension : ");
		String filename=sc.nextLine();
		if(isValidExtension(filename, extension)) {
			System.out.println("given file extension is valid ");
			
		}
		else {
			System.out.println("given file extension is not valid");
		}

	}

	private static boolean isValidExtension(String filename, List<String> extension) {
		// TODO Auto-generated method stub
		int dotindex=filename.lastIndexOf(".");
		if(dotindex>=0) {
			String ext=filename.substring(dotindex);
			return extension.contains(ext);
		}
		return false;
	}



}
