package com.string;

import java.util.Scanner;

public class FirstnonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			boolean value=true;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					value=false;
				}
			}
			if(value) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		

	}

}
