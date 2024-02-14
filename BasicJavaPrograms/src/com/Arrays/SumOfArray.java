package com.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] arr=new int[] { 1,3,5,3,5,3};
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
