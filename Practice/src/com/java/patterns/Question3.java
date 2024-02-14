package com.java.patterns;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arry:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			boolean value=true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					value=false;
				}
			}
			if(value) {
				System.out.println(arr[i]);
			}
		}

	sc.close();
	}

}
