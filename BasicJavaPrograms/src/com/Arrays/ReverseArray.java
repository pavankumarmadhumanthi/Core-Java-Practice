package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		int size=arr.length;
		
		int temp = 0;
		for (int i = 0; i <size; i++) {
			if(i<size/2) {
				temp=arr[i];
				arr[i]=arr[size-i-1];
				arr[size-i-1]=temp;
				
			}
		
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}

	}}


