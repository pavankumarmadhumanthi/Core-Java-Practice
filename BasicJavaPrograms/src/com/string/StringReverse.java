package com.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
