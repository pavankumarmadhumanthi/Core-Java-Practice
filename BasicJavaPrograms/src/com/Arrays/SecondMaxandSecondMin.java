package com.Arrays;

public class SecondMaxandSecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,3,5,7,9,8};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}

		}
		System.out.println(arr[1]+" "+ arr[arr.length-2]);

	}

}
