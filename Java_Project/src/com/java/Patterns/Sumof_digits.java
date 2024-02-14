package com.java.Patterns;

public class Sumof_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=93;
		int sum=0;
		int sum1=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		//second method
		for(int i=num;i>0;i=num/10) {
			sum1=sum1+(num%10);
		}
		System.out.println(sum);

	}

}
