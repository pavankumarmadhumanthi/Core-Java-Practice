package in.ashokit;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("before Swapping a="+a+" " +"b=" + b);
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after Swapping a="+a+" " +"b=" + b);

	}
}
