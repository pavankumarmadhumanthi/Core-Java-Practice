package com.java.Arrays;

import java.util.Scanner;

public class Array_sum {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr =new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the interger value for array elemrnt:"+i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Sum of array elements is");
		System.out.println(sum);
		

	}

}
