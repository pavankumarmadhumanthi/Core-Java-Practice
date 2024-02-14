package com.java.string_operations;

import java.util.Scanner;

public class ReverseofString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the String :");
		String string = sc.nextLine();
		char[] ch=string.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==32) {
				System.out.print("#");
			}
			else {
				System.out.print(ch[i]);
			}
		}
		
	}

}
