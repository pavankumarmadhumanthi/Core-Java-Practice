package com.java.for_loops;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.printf("the %d th element of array",i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.printf("the sum of given array is %d",sum);

	}

}
