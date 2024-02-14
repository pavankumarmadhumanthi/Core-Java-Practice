package in.ashokit;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Divident number : ");
		int divident=sc.nextInt();
		System.out.println("Enter the Divisor number  : ");
		int divisor=sc.nextInt();
		System.out.println("quotient is : "+ divident/divisor);
		System.out.println("Reminder is : "+ divident%divisor);
		
		

	}

}
