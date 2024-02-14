package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");

		String str = sc.nextLine();
		
		String[] ch=str.split(" "+"");
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			for(int j=ch[i].length()-1;j>=0;j--) {
				System.out.print(ch[i].charAt(j)+"");
			}
			System.out.print(" ");
		
		
	}

}
}