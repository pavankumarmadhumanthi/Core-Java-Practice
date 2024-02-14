package com.example;

import java.util.Scanner;

public class RemovingSpacesInString {
	public static void main(String[] args) {
	String str=new Scanner(System.in).nextLine();
	StringBuffer f=new StringBuffer();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=32) {
			f.append(str.charAt(i));
			
		}
		
	}
	System.out.println(f);

}
}
