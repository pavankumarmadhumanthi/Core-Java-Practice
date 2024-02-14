package com.java.arrays;

import java.util.Scanner;

public class Elements_Modifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>=1) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]/2);
				}else {
					System.out.println(arr[i]*2);
				}
			}else {
				arr[i]=-1;
				System.out.println(arr[i]);
			}
		}
		

	}

}
