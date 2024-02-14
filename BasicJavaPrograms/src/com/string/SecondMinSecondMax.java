package com.string;

import java.util.Scanner;

public class SecondMinSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int length=sc.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();	
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					
				}
				
			}
		}

	}

}
